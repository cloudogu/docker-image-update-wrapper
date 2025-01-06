package com.cloudogu.gitopswrapper

class GitOpsWrapper {
    def script

    GitOpsWrapper(def script) {
        this.script = script
    }

    def deploy(Map gitopsConfig) {
        // Load the whole `ces-build-lib` dynamically for isolation
        def cesLib = script.library(identifier: 'github.com/cloudogu/ces-build-lib@main').load()

        // Access the Git class and other classes from the library
        def git = new cesLib.com.cloudogu.ces.cesbuildlib.Git(script)  // Isolated instance of `Git`
        script.echo "Using isolated Git instance in deploy"

        git.checkout(
            gitopsConfig.scm.repositoryUrl,
            'main',
            gitopsConfig.scm.credentialsId
        )

        // Example: If you want to call another utility class from the lib
        // def maven = new cesLib.com.cloudogu.ces.cesbuildlib.Maven(script)

        script.deployViaGitops(gitopsConfig)
    }
}

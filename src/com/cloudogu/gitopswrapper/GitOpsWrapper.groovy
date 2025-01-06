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
        script.echo "Using isolated Git instance in deploy"


        script.deployViaGitops(gitopsConfig)
    }
}

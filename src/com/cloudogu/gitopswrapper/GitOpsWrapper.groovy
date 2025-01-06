package com.cloudogu.gitopswrapper

class GitOpsWrapper {
    def script

    GitOpsWrapper(def script) {
        this.script = script
    }

    def deploy(Map gitopsConfig) {
        // Load the entire library for isolation
        def cesLib = script.library(identifier: 'github.com/cloudogu/ces-build-lib@main').load()

        // Access `Git` as a function (since it's in `vars`)
        def git = cesLib.Git  // Reference to the `Git` step, no `new` required

        script.echo "Using isolated Git instance for deployment"

        // Call the `Git` step
        git.checkout(
            gitopsConfig.scm.repositoryUrl,
            'main',
            gitopsConfig.scm.credentialsId
        )

        // Call deployViaGitops within the isolated environment
        script.deployViaGitops(gitopsConfig)
    }
}

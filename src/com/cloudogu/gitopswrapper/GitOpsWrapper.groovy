package com.cloudogu.gitopswrapper

class GitOpsWrapper {
    def script

    GitOpsWrapper(def script) {
        this.script = script
    }

    def deploy(Map gitopsConfig) {
        def cesLibWrapper = new CesBuildLibWrapper(script)  // Create new instance of nested class
        def git = cesLibWrapper.git()  // Get Git reference

        script.echo "Using isolated Git instance for deployment"

        git.checkout(
            gitopsConfig.scm.repositoryUrl,
            'main',
            gitopsConfig.scm.credentialsId
        )

        script.deployViaGitops(gitopsConfig)
    }

    // Nested class for `ces-build-lib` isolation
    class CesBuildLibWrapper {
        def script

        CesBuildLibWrapper(def script) {
            this.script = script
        }

        def git() {
            return this.script.Git  // Return reference to Git step
        }
    }
}

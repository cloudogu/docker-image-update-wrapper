package com.cloudogu.gitopswrapper

class GitOpsWrapper {
    def script

    GitOpsWrapper(def script) {
        this.script = script
    }

    def deploy(Map gitopsConfig) {
        def git = script.Git()  // Use the globally available Git() step
        script.echo "Using Git instance in deploy"
        git.checkout(
            gitopsConfig.scm.repositoryUrl,
            'main',
            gitopsConfig.scm.credentialsId
        )
        script.deployViaGitops(gitopsConfig)
    }
}

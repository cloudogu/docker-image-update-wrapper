package com.cloudogu.gitopswrapper

class GitOpsWrapper {
    def script  // Pipeline context

    GitOpsWrapper(def script) {
        this.script = script
    }

    def deploy(Map gitopsConfig) {
        def git = script.Git()  // Call the Git() pipeline step directly
        script.echo "Using Git instance in deploy"
        script.deployViaGitops(gitopsConfig)
    }
}

package com.cloudogu.gitopswrapper

class GitOpsWrapper {
    def script  // Holds the pipeline context (`this`)
    def git  // Holds a new Git instance

    GitOpsWrapper(def script) {
        this.script = script
        this.git = new com.cloudogu.ces.cesbuildlib.Git(script)  // Create a new instance of the Git class for this wrapper
    }

    def deploy(Map gitopsConfig) {
        script.echo "Deploying with a new Git instance"
        script.deployViaGitops(gitopsConfig)
    }
}

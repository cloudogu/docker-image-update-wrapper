package com.cloudogu.gitopswrapper

class GitOpsWrapper {
    def script  // Holds the pipeline context (`this`)

    // Constructor to inject the pipeline context
    GitOpsWrapper(def script) {
        this.script = script
    }

    // Deploy method using the script context
    def deploy(Map gitopsConfig) {
        script.deployViaGitops(gitopsConfig)  // Call the global method through the pipeline context
    }
}

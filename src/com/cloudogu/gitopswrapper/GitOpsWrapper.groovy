package com.cloudogu.gitopswrapper

class GitOpsWrapper implements Serializable {
    def script

    GitOpsWrapper(script) {
        this.script = script  // Pass the Jenkins script context
    }

    def deploy(Map gitopsConfig) {
        script.deployViaGitops(gitopsConfig)  // Call the global function `deployViaGitops`
    }
}

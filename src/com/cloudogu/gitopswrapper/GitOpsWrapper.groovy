package com.cloudogu.gitopswrapper

class GitOpsWrapper implements Serializable {
    def script

    GitOpsWrapper(script) {
        this.script = script
    }

    def deploy(Map gitopsConfig) {
        script.library('github.com/cloudogu/gitops-build-lib@0.7.0')  // Reload ces-build-lib
        script.deployViaGitops(gitopsConfig)  // Call global function with context
    }
}

package com.cloudogu.gitops

@Library('github.com/cloudogu/gitops-build-lib@0.7.0')
import static com.cloudogu.gitops.gitopsbuildlib.deployViaGitops

class GitOpsWrapper {
    def deploy(Map gitopsConfig) {
        deployViaGitops(gitopsConfig)  // Aufruf der Originalfunktion
    }
}


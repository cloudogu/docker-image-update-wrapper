package com.cloudogu.gitops

static import com.cloudogu.gitops.gitopsbuildlib.*

class GitOpsWrapper {
    def deploy(Map gitopsConfig) {
        deployViaGitops(gitopsConfig)  // Aufruf der Originalfunktion
    }
}


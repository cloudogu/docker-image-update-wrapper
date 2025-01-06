package com.cloudogu.gitops

import com.cloudogu.gitops.gitopsbuildlib.*

class GitOpsWrapper {
    def deploy(Map gitopsConfig) {
        deployViaGitops(gitopsConfig)  // Aufruf der Originalfunktion
    }
}


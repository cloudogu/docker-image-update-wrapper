package com.cloudogu.gitopswrapper

import com.cloudogu.gitops.gitopsbuildlib.deployViaGitops

class GitOpsWrapper {
    def deploy(Map gitopsConfig) {
        deployViaGitops(gitopsConfig)  // Aufruf der Originalfunktion
    }
}


package com.cloudogu.gitopswrapper

//import com.cloudogu.gitops.gitopsbuildlib.deployViaGitops
import static com.cloudogu.gitops.gitopsbuildlib.deployViaGitops

class GitOpsWrapper {
    static void deploy(Map gitopsConfig) {
        deployViaGitops(gitopsConfig)  // Aufruf der Originalfunktion
    }
}


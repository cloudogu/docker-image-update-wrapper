package com.cloudogu.gitopswrapper


import com.cloudogu.gitops.gitopsbuildlib

class GitOpsWrapper {
    def deploy(Map gitopsConfig) {
        def gitOpsLib = new gitopsbuildlib()  // Create a new instance of GitOpsBuildLib
        gitOpsLib.deployViaGitops(gitopsConfig)  // Call the deployViaGitops function
    }
}

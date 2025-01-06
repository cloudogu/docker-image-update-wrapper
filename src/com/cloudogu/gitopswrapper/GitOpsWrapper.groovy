package com.cloudogu.gitopswrapper

import com.cloudogu.gitops.GitopsBuildLib

class GitOpsWrapper {
    def deploy(Map gitopsConfig) {
        def gitOpsLib = new GitopsBuildLib()  // Create a new instance of GitOpsBuildLib
        gitOpsLib.deployViaGitops(gitopsConfig)  // Call the deployViaGitops function
    }
}

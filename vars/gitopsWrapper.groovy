@Library('github.com/cloudogu/gitops-build-lib@0.7.0') _

import com.cloudogu.gitops.GitopsBuildLib

class GitOpsWrapper {
    def deploy(Map gitopsConfig) {
        def gitOpsLib = new GitopsBuildLib()  // Create a new instance of the library class
        gitOpsLib.deployViaGitops(gitopsConfig)  // Call the deployViaGitops function
    }
}

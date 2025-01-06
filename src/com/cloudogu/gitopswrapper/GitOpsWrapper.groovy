package com.cloudogu.gitopswrapper

class GitOpsWrapper {
    def script

    GitOpsWrapper(def script) {
        this.script = script
    }

    def deploy(Map gitopsConfig) {
        def cesLib = script.library(identifier: 'github.com/cloudogu/ces-build-lib@main').load()
        def git = cesLib.Git(script)  // Create an isolated instance of Git

        script.echo "Using isolated Git instance in deploy"
        git.checkout(
            gitopsConfig.scm.repositoryUrl,
            'main',
            gitopsConfig.scm.credentialsId
        )
        script.deployViaGitops(gitopsConfig)  // Call deployViaGitops with isolated context
    }
}

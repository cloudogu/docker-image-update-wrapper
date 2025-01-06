import com.cloudogu.gitopswrapper.GitOpsWrapper

def create(script) {
    return new GitOpsWrapper(script)  // Pass the script context for use in deploy()
}

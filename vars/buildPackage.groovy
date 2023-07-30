import com.jenkins.BuildMS
def call(){
    println "Build API package ....."

    BuildMS buildMS = new BuildMS()
    buildMS.mvnBuildPackage()
}
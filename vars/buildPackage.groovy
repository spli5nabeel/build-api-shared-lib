import com.jenkins
def call(){
    println "Build API package ....."

    BuildMS buildMS = new BuildMS()
    buildMS.mvnBuildPackage()
}
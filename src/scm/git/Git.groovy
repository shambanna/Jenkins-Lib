package git;

class Git implements Serializable{
 def script; 
  Git(script){
    this.script = script;
  }
  void test(){
  this.script.git(url: "https://github.com/GoogleCloudPlatform/getting-started-java.git", branch: "master")
  }
}

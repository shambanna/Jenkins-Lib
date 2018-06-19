package git;

class Git implements Serializable{
 def script; 
  Git(script){
    this.script = script;
  }
  void test(){
  this.script.println "test is success"
   this.script.git("url" : https://github.com/jglick/simple-maven-project-with-tests.git)
  }
}

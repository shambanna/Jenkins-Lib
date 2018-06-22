package mvn;

class Maven implements Serializable{
 def script; 
  Maven(script){
    this.script = script;
  }
  void test(){
  this.script.sh "mvn clean install -f getting-started-java/helloworld-jsp/"
  }
}

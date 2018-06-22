package mvn;

class Maven implements Serializable{
 def script; 
  Maven(script){
    this.script = script;
  }
  void test(){
  this.script.sh "/usr/local/Cellar/maven/3.5.3/libexec/bin/mvn jetty:run-exploded -f helloworld-jsp/"
  }
}

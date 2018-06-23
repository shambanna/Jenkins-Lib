package com;
@Grab('org.yaml:snakeyaml:1.17')
import org.yaml.snakeyaml.Yaml

class Yaml implements Serializable{
 def script; 
  Yaml(script){
    this.script = script;
  }
  void test(){
  List projects = new Yaml().load(("vm.yaml" as File).text)
  this.script.println projects

  }
}

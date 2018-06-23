package com;
@Grab('org.yaml:snakeyaml:1.17')
import org.yaml.snakeyaml.Yaml

class Yaml implements Serializable{
 def script; 
  Yaml(script){
    this.script = script;
  }
  void test(){
  def yaml = this.script.libraryResource "vm.yaml"
  appBuild = new Yaml().load(this.script.libraryResource("vm.yaml"))
  this.script.println appBuild

  }
}

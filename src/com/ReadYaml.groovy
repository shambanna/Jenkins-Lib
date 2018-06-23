package com;
@Grab('org.yaml:snakeyaml:1.17')
import org.yaml.snakeyaml.Yaml

class ReadYaml implements Serializable{
 def script; 
  ReadYaml(script){
    this.script = script;
  }
  void test(){
  def yaml = this.script.libraryResource "vm.yaml"
  def appBuild = new Yaml().load(yaml)
  this.script.println appBuild

  }
}

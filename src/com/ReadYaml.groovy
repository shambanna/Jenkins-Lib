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
  String path = "../"+this.script.env.JOB_NAME+"@libs/shared-lib/resources/vm.yaml"
  this.script.println path
  appBuild = new Yaml().load("../../"+this.script.env.JOB_NAME+"@libs/shared-lib/resources/vm.yaml")
  this.script.println appBuild

  }
}

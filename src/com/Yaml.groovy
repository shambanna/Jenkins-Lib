package com;
@Grab('org.yaml:snakeyaml:1.17')
import org.yaml.snakeyaml.Yaml

class Yaml implements Serializable{
 def script; 
  Yaml(script){
    this.script = script;
  }
  void test(){
  this.script.sh "ls -al"
  this.script.sh "pwd"
  def yaml = this.script.libraryResource "vm.yaml"
  this.script.println yaml
  appBuild = new Yaml().load(this.script.libraryResource "vm.yaml")
  //List projects = new Yaml().load(("resources/vm.yaml" as File).text)
  this.script.println appBuild

  }
}

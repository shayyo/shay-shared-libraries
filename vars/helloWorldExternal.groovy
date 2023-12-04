def call(Map config = [:]) {
  loadLinuxScript(scriptname: "hello_world.sh")
  #sh "./hello_world.sh ${config.fname} ${config.lname}"
  sh "./hello_world.sh s s"
}

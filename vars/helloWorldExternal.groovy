def call(Map config = [:]) {
  loadLinuxScript("hello_world.sh")
  sh "./hello_world.sh ${config.fname} ${config.lname}"
}

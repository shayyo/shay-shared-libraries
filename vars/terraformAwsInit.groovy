def call(Map config = [:]) {
  sh "echo Hello ${config.fname} ${config.lname}"
}

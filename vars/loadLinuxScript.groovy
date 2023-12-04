def call(Map config = [:]) {
  def scriptcontent = libraryResource "scripts/linux/${config.name}"
  sh "./hello_world.sh ${config.fname} ${config.lname}"
}

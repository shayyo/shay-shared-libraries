def call(String scriptname) {
  def scriptcontents = libraryResource "scripts/linux/hello_world.sh}"
  writeFile file = "hello_world.sh", text: scriptcontents

}

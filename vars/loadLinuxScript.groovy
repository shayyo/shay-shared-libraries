def call(Map config = [:]) {
  def scriptcontents = libraryResource "scripts/linux/${config.scriptname}"
  writeFile file = "${config.scriptname}", text: scriptcontents
}

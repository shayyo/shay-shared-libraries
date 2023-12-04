def call(Map config = [:]) {
  def scriptcontents = libraryResource "scripts/linux/${config.scriptname}"
  writeFile file = "${config.scriptname}", text: scriptcontents
  sh "chmod a+x ./${config.scriptname}"
}

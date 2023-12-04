def call(Map config = [:]) {
  def scriptcontent = libraryResource "scripts/linux/${config.name}"
  writeFile file = ${config.name}, text: scriptcontents
  sh "chmod a+x ./${config.name}"
}

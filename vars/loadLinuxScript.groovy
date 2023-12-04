def call(String scriptname) {
  def scriptcontents = libraryResource "scripts/linux/${scriptname}"
  writeFile file: "${scriptname}", text: scriptcontents
  sh "chmod a+x ./${scriptname}"
}

def call() {
  def filecontents = libraryResource "resources/config.properties"
  echo "Config value: ${filecontents}"
}


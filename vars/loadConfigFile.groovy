def call() {
  def filecontent = libraryResource "../resources/config.properties"
  echo "Config value: ${filecontent}"
}


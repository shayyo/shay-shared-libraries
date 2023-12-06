def call() {
  configFile = load 'resources/config.properties'
  echo "Config value: ${configFile}"
}

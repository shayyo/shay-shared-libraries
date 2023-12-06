def call() {
  content = load 'resources/config.properties'
  echo "Config value: ${content}"
}


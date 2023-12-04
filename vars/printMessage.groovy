def call(String message = 'This is just a default message') {
  sh "echo ${message}"
}

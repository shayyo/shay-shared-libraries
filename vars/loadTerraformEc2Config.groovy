def call(String region) {
  sh "echo provider aws {"
  sh "echo region = ${region}"
  sh "echo }"
  
}

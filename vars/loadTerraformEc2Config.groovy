def call(String region) {
  sh "echo provider \"aws\" {
             region = ${region}
           }"
}

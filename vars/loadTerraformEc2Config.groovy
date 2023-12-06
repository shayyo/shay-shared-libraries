def call(String region) {
  sh "echo -n provider \"aws\" {\n
             region = ${region}\n
           }"
}

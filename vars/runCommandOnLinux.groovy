def call(String host, String port, String username, String password, String command) {
    // Use SSH to run the arbitrary command on the Linux machine
    def cmd = "sshpass -p ${password} ssh -o StrictHostKeyChecking=no ${username}@${host} -p ${port} '${command}'"
    def process = cmd.execute()
    process.waitFor()

    return process.text.trim()
}

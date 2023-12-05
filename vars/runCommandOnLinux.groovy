def call(String host, String port, String username, String password, String command) {
    sshpass -p ${password} ssh -o StrictHostKeyChecking=no ${username}@${host} -p ${port} ${command}
}

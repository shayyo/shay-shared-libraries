def call(String host, String port, String username, String password, String command) {
    // Use SSH to run the arbitrary command on the Linux machine
    sshpass -p ${password} ssh -o StrictHostKeyChecking=no ${username}@${host} -p ${port} ${command}

}

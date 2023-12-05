def call(String host, String username, String password, String command) {
    pipeline {
        agent any

        stages {
            stage('Run Command on Linux Machine') {
                steps {
                    script {
                        def output = runCommand(host, username, password, command)
                        echo "Command output: ${output}"
                    }
                }
            }
        }
    }
}

def runCommand(String host, String username, String password, String command) {
    // Use SSH to run the arbitrary command on the Linux machine
    def cmd = "sshpass -p ${password} ssh ${username}@${host} '${command}'"
    def process = cmd.execute()
    process.waitFor()

    return process.text.trim()
}

@Library('terraformLibrary') _

pipeline {
  agent any 

  environment {
    AWS_ACCESS_KEY_ID = credentials('AWS_ACCESS_KEY_ID')
    AWS_SECRET_ACCESS_KEY = credentials('AWS_SECRET_ACCESS_KEY')
  }

  stages {
    stage('Terraform Init') {
      steps {
        script {
          terraform.init()
        }
      }
    }

    stage('Terraform Apply') {
      steps {
        script {
          terraform.apply()
        }
      }
    }

    stage('Terraform Destroy') {
      steps {
        script {
          terraform.destroy()
        }
      }
    }
  }
}

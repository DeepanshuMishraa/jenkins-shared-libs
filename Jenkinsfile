@Library("Shared") _
pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                script{
                    hello()
                }
            }
        }
        
        stage("Clone") {
            steps{
                echo "We are heere"
                script{
                    clone("https://github.com/DeepanshuMishraa/radius","main")
                }
            }
        }
    }
}

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
                script{
                    clone("https://github.com/DeepanshuMishraa/radius","main")
                }
            }
        }
    }
}

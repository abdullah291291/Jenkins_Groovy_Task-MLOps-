pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Check out your source code repository here
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Define your build steps here
                script {
                    sh 'python3 sample.py' // Replace with your Python interpreter and script name if needed
                }
            }
        }
    }
}

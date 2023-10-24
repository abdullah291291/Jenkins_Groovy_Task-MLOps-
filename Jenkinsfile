pipeline{
    agent any

    stages{
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Install Dependencies') {
            steps {
                script {
                    def Dependencies_script = load 'pipeline.groovy'
                    Dependencies_script.Build()
                }
            }
        }

        stage('Test'){
            steps{
                script{
                    def test_script = load 'pipeline.groovy'
                    test_script.test()
                }
            }
        }
        stage('Deploy'){
            steps {
                script{
                    def deploy_script = load 'pipeline.groovy'
                    deploy_script.deploy()
                }
            }
        }
    }
}

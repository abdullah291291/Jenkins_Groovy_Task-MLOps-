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
                    def dependencies_script = load 'pipeline.groovy'
                    dependencies_script.build()
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
                    def currentBranch = currentBuild.sourceBranch
                    deploy_script.deploy(currentBranch)
                }
            }
        }
    }
}

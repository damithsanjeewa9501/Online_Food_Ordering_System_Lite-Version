pipeline {

    agent any

    environment {
        APP_NAME = "Online_Food_Ordering_System"
    }

    stages {

        stage('Checkout') {
            steps {
                echo "Checking out source code"
                checkout scm
            }
        }


        stage('Build') {
            steps {
                echo "Building application"

                sh '''
                    mvn clean package -DskipTests
                '''
            }
        }


        stage('Test') {
            steps {
                echo "Running tests"

                sh '''
                    mvn test
                '''
            }
        }


        stage('Package') {
            steps {
                echo "Creating artifact"

                archiveArtifacts artifacts: 'target/*.jar',
                                 fingerprint: true
            }
        }

    }


    post {

        success {
            echo "Build completed successfully"
        }


        failure {
            echo "Build failed"
        }

    }

}

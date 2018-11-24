pipeline {
agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn --fail-never clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn --fail-at-end clean test'
            }
        }
    }
}
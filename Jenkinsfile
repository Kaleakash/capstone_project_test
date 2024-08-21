pipeline {
    agent any
    
    tools {
        maven "MAVEN"
        nodejs "NodeJS"
    }
    
    stages {
        stage("version of software"){
            steps{
                sh "java --version"
                sh "mvn --version"
                sh "docker --version"
                sh "docker-compose --version"
            }
        }

        

    }
}
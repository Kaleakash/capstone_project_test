pipeline {
    agent any
    
    tools {
        maven "MAVEN"
        nodejs "NodeJS"
    }
    
    stages {
        stage("version of software"){
            steps{
                bat "java --version"
                bat "mvn --version"
                bat "docker --version"
                bat "docker-compose --version"
            }
        }
    }
    
    stages{
        stage("Build Micro Service Project"){
            steps{
                dir("./backend/eureka-server"){
                    bat "dir"    
                }
            }    
        }
    }
        
}
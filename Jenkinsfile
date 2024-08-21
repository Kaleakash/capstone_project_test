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
                bat "node version"
                bat "npm version"
                #bat "npm install angular/cli@16.0.1"
                #bat "ng version"
            }
        }
        stage("Build Micro Service Project"){
            steps{
                dir("./backend/micro-service-app"){
                    bat "dir"  
                    bat "mvn clean package"  
                }
            }    
        }
        stage("Build Front end project"){
            steps{
                dir("./frontend/front-end-app"){
                    bat "dir"  
                    bat "ng build"  
                }
            }    
        }
    }
        
}
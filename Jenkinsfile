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
                bat "node --version"
                bat "npm --version"
                bat "ng version"
            }
        }
        stage("Build Micro Service Project"){
            steps{
                dir("./backend/micro-service-app/micro-service-app/"){
                    bat "dir"  
                    bat "mvn clean package"  
                }
            }    
        }
        stage("Build Front end project"){
            steps{
                dir("./frontend/front-end-app/"){
                    bat "dir"  
                    bat "npm install"
                    bat "ng build"  
                }
            }    
        }

        stage("run the docker containers"){
            steps{
                bat "docker-compose down"
                bat "docker-compose up --build -d"       
            }
        }

        stage("Check images and runnign containers"){
            steps{
                bat "docker images"
                bat "docker ps"       
            }
        }
    }
        
}
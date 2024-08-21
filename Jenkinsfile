pipeline {
    agent any
    
    tools {
        maven "MAVEN",
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
        stage{
            steps("Build Micro Service Project"){
                dir("./backend/eureka-server"){
                sh "pwd"    
                }
            }
        }
        stage{    
            steps("Build Front end project"){
                dir("./frontend/front-end-app"){
                sh "pwd"    
            }
        }
        stage("run the docker containers"){
            steps{
                sh "docker-compose down"
                sh "docker-compose up --build -d"       
            }
        }
        stage("Check images and runnign containers"){
            steps{
                sh "docker images"
                sh "docker ps"       
            }
        }
    }
}
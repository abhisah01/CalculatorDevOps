pipeline {
    agent any 
    options {
        skipDefaultCheckout(true)
    }
  
    stages {
        stage('Clean Workspace') {
            steps {
                cleanWs()
            }
        }
        
        stage('SCM Clone') { 
            steps {
                sh "git clone https://github.com/abhisah01/CalculatorDevOps.git"
            }
        }
      
        stage('Clean') {
            steps {
                sh "mvn clean -f CalculatorDevOps"
            }
        }
        
        stage('Test') { 
            steps {
                sh "mvn test -f CalculatorDevOps"
            }
        }
        
        stage('Package') { 
            steps {
                sh "mvn package -f CalculatorDevOps"
            }
        }
        
        stage('Build Docker Image') {
            steps {
                sh "docker build -t project:1 /var/lib/jenkins/workspace/Mini-Project/CalculatorDevOps"
            }
        }
        
        stage('Push Docker Image') {
            steps {
                // withCredentials([usernamePassword(credentialsId: 'docpass', passwordVariable: 'pass', usernameVariable: 'user')]) {
                    sh 'docker login -u abhisah01 -p c2df4857-f553-4342-aa69-5b0488e47831'
                // }
                
                sh "docker image tag spe-project:1 abhisah01/project:1"
                sh "docker image push docker.io/abhisah01/project:1"
            }
        }
    }
}

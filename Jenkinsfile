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
    }
}

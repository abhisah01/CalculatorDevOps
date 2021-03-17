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
                sh "git clone https://github.com/abhisah01/DevOpsCalculator.git"
            }
        }
      
        stage('Clean') {
            steps {
                sh "mvn clean -f DevOpsCalculator"
            }
        }
        
        stage('Test') { 
            steps {
                sh "mvn test -f DevOpsCalculator"
            }
        }
        
        stage('Package') { 
            steps {
                sh "mvn package -f DevOpsCalculator"
            }
        }
    }
}

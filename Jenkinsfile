pipeline {
    agent any
    stages {
        stage('PREPARE'){
            steps {
                sh "sed -i 's|@DESIGN_URL@|${DESIGN_URL}|' requirements.txt"
                sh "cat requirements.txt"
                sh "printenv"
               }
        }
    }
}


pipeline {
    agent any
    stages {
        stage('PREPARE'){
            steps {
                bat "sed -i 's|@DESIGN_URL@|${DESIGN_URL}|' requirements.txt"
                bat "cat requirements.txt"
                bat "printenv"
               }
        }
    }
}


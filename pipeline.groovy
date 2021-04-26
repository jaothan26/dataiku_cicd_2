pipeline {
    agent any
    environment {
        bundle_name = "${sh(returnStdout: true, script: 'echo "bundle_`date +%Y-%m-%d_%H-%m-%S`"').trim()}"
    }
    stages {
        stage('PREPARE'){
            steps {
                sh 'echo ${bundle_name}'
                git credentialsId: "git_hub_ssh", url: "git@github.com:fsergot/dss_pipeline.git"
                sh "sed -i 's|@DESIGN_URL@|${DESIGN_URL}|' requirements.txt"
                sh "cat requirements.txt"
                sh "printenv"
            }
        }
        }
      

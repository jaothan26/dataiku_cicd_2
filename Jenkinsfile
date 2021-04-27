pipeline {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                echo "Hello World!"
                echo env.PATH
                bat 'wmic computersystem get name'
                bat 'echo %PATH%'
                echo bat(returnStdout: true, script: 'set')
            }
        }
    }
}

pipeline {
    agent { label 'master' }
    stage('Checkout'){
        stdout = bat(returnStdout: true, script: 'git rev-parse HEAD')
        println("stdout ################ " + stdout + " ####################")
   }
}
  




pipeline {
    agent { label 'master' }
                def getCommandOutput(cmd) {
                    if (isUnix()){
                        return sh(returnStdout:true , script: '#!/bin/sh -e\n' + cmd).trim()
                    } else{
                        stdout = bat(returnStdout:true , script: cmd).trim()
                        result = stdout.readLines().drop(1).join(" ")       
                        return result
                    } 
                }      
            }
        
  




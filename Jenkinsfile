pipeline
{
   agent{
      label "slave2"
   }
   
 properties([parameters([choice(choices: ['Prod', 'Uat', 'Dev'], description: 'deploying in progress.', name: 'deploy'), string(description: 'Please enter ip address of Machine where you want to deploy artifact', name: ' servername', trim: false), string(description: 'Please Jobname to get ocation of artifact', name: 'jobname', trim: false)])])
  
  stages{
  stage("build"){
  steps{
    sh "mvn deploy" 
     sh "scp -v -o StrictHostKeyChecking=no /tmp/workspace/${params.jobname}/target/biomni-1.0-SNAPSHOT.jar root@${params.servername}:/tmp" 
  }
  }
  }
} 

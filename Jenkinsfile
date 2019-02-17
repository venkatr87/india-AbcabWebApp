  pipeline
{
   agent{
      label "slave2"
   }
   
 parameters
{
 choice(name: 'Environment',choices: 'Dev\nUAT\nPRD',description: 'Please select Environment')
 string(name:  'servername',description: 'Please enter ip address of Machine where you want to deploy artifact')
 string(name:  'Jobname',description: 'Please Jobname to get ocation of artifact')
 string(name:  'ContainerId',description: 'Please Enter Container ID:')
}
  stages{
  stage("build"){
  steps{
    sh "mvn clean deploy" 
     sh "scp -v -o StrictHostKeyChecking=no /tmp/workspace/${params.Jobname}/target/AbcabWebApp.war root@${params.servername}:/tmp"
     sh "ssh root@${params.servername}"
     sh "docker cp /tmp/AbcabWebApp.war ${params.ContainerId}:/usr/local/tomcat/webapps"
  }
  }
  }
} 

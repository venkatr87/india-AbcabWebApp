pipeline
{
   agent{
      slave2
   }
   
  properties([parameters([choice(choices: ['Prod', 'Uat', 'Dev'], description: 'deploying in progress.', name: 'Select the server to deploy')])]) 
  
  stages{
  stage{
  steps{
    sh"mvn deploy"  
  }
  }
  }
} 

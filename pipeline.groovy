pipelineJob('DSL_Pipeline') {

  def repo = 'https://github.com/Veeresh2708/india-AbcabWebApp.git'

  triggers {
    scm('H/5 * * * *')
  }
  description("Pipeline for $repo")

  definition {
    cpsScm {
      scm {
        git {
          remote { url(repo) }
          branches('master')
            }
          }
           }
            }
  }

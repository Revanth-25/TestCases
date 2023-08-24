pipeline{
     agent any 
           stages {
                stage('Clone'){
                                 steps{
                                        //bat "rmdir   /s  /q  TestCases"
                                          bat "git clone https://github.com/Revanth-25/TestCases.git"
                                          bat "mvn clean -f TestCases"
                                          echo 'Cloning Done'
                                         }
                               }
                stage('Test'){
                                steps{
                                       bat "mvn test -f TestCases"
                                       echo 'Tests Done'
                                     }
                               }
                stage('Deploy'){
                                steps{
                                      bat "mvn deploy -f TestCases"
                                      echo 'Deploy done'
                                     }
                                }
                  }
        }

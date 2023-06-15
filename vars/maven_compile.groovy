def call(){
    sh 'ls -lrt'
    sh "mvn clean package"
  }
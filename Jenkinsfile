pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                sh 'mvn -Dskiptests clean install'
            }
        }
    }
}
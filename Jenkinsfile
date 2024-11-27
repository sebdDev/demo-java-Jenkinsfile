pipeline {
    agent any

    tools {
        maven 'Maven 3.8.1'
        jdk 'JDK 11'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', 
                    url: 'https://github.com/vanessakovalsky/demo-java.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package -DskipTests=true'
            }
        }

        stage('Deploy') {
            steps {
                // Exemple de déploiement (à adapter)
                sh 'cp target/*.jar /path/to/deployment/directory/'
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: 'target/*.jar', 
                             fingerprint: true
            
            emailext (
                subject: "Build Réussi: ${currentBuild.fullDisplayName}",
                body: "Le build a été effectué avec succès.",
                to: 'equipe@exemple.com'
            )
        }
        
        failure {
            emailext (
                subject: "Build Échoué: ${currentBuild.fullDisplayName}",
                body: "Le build a échoué. Veuillez vérifier les logs.",
                to: 'equipe@exemple.com'
            )
        }
    }
}

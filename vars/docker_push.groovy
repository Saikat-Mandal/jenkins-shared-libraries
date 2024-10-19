def call(String project , String imageTag , String dockerHubUser){
   echo "Pushing the code to dockerhub"
   withCredentials([usernamePassword("credentialsId":"dockerHubCred" , passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
   bat "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
   bat "docker image tag ${project}:${imageTag} ${env.dockerHubUser}/${project}:${imageTag}"
   bat "docker push ${env.dockerHubUser}/${project}:${imageTag}"
   echo "Code pushing successfull !"
}

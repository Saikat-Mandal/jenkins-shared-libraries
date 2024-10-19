def call(String imageName , String imageTag , String username){
  echo "Building the code"
  bat "docker build -t ${username}/${imageName}:${imageTag} ."
  echo "code building successfull !"   
}

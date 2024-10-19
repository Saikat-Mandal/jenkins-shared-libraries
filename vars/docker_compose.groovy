def call(){
  echo "Deploying the code"
  bat "docker compose up -d"
  echo "Code deploying successfull !"
}

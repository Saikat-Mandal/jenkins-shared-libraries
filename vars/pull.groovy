def call(String url , String branch){
  echo 'Pulling the code'
  git url: url , branch: branch
  echo " code pulled successfully !"
}

def clone (String url , String branch){
   echo "Cloning Code"
   git url : "${url}" , branch : "${branch}"
  echo "Cloning Done"
}

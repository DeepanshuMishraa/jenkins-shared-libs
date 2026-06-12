def Clone(String url , String branch) {
  echo "Cloning the git repository"
  git url:"${url}", branch:"${branch}"
  echo "Clone successfull"
}

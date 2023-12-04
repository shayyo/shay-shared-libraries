def terraform_initialize() {
  sh "terraform init"
}

def terraform_paln() {
  sh "terraform plan"
}

def terraform_apply() {
  sh "terraform apply"
}

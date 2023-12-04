def terraform_initialize() {
  sh "terraform init"
}

def terraform_plan() {
  sh "terraform plan"
}

def terraform_apply() {
  sh "terraform apply"
}

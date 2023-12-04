def terraform_initialize() {
  sh "terraform init"
}

def terraform_plan() {
  sh "terraform plan -out myplan.tf"
}

def terraform_apply() {
  sh "terraform apply myplan.tf"
}

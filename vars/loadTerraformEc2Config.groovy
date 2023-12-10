def call() {
  def terraform_ec2_config_content = libraryResource "aws/terraform/ec2.tf"
  writeFile file: "ec2.tf", text: terraform_ec2_config_content
}

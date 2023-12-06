def call(String region) {
echo "
  provider \"aws\" {
    region = \"eu-central-1\"
  }

  resource \"aws_instance\" \"enforcer\" {
    ami           = \"ami-02a015c2b1c34f1a8\"
    instance_type = \"t2.medium\"
    count 	= 5
    key_name	= \"CNDR_key\"

    tags = {
      Name = \"enforcer\"
    }
  }"
}

#!/bin/sh

rm -rf clients/java
java -jar ../swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate \
  -i ../swagger-demo/target/api-docs/swagger.json \
  -l java \
  -o clients/java \
  -c ./config.json

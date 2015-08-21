#!/bin/sh

java -jar ../swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate \
  -i ../swagger-demo/target/classes/api-docs/swagger.json \
  -l php \
  -o clients/php \
  -c config.json

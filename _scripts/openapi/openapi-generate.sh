#!/bin/zsh
# TODO how to set the path?
# https://openapi-generator.tech/docs/globals
#openapiPath=~/BackendApps/suby-openapi
## rebuild schema
#
#(cd $openapiPath && npm run build && spectral lint _build/openapi.yaml && cd -)

java -jar openapi-generator.jar -c ./openapi-generator.properties -t android

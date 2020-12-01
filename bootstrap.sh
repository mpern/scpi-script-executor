#!/usr/bin/env sh

# ref. https://help.sap.com/viewer/368c481cd6954bdfa5d0435479fd4eaf/LATEST/en-US/03b32eb2c5c249f0a59bcd27c44d1e4e.html
GROOVY_VERSION=2.4.12
echo "Setting up Groovy runtime $GROOVY_VERSION..."
curl -O "https://archive.apache.org/dist/groovy/$GROOVY_VERSION/distribution/apache-groovy-binary-$GROOVY_VERSION.zip"
unzip -qo apache-groovy-binary*.zip
echo "Setting up Groovy runtime $GROOVY_VERSION... DONE"

# ref. https://help.sap.com/viewer/368c481cd6954bdfa5d0435479fd4eaf/LATEST/en-US/062f7a7e5c374e67b568dddc7b7844a9.html
echo "Downloading SCPI APIs..."
mkdir -p 'lib'
(
    cd lib || exit 1
    curl -O --cookie 'eula_3_1_agreed=tools.hana.ondemand.com/developer-license-3_1.txt' https://tools.hana.ondemand.com/additional/com.sap.it.public.generic.api-2.20.0.jar
    curl -O --cookie 'eula_3_1_agreed=tools.hana.ondemand.com/developer-license-3_1.txt' https://tools.hana.ondemand.com/additional/cloud.integration.script.apis-1.36.1.jar
)
echo "Downloading SCPI APIs... DONE"

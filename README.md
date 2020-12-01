# scpi-script-executor

Run your SAP Cloud Platform Integration Groovy scripts on your local machine for easier test and debugging.

## Prerequites

- JDK installed and configured (e.g. [SAPMachine][machine])\
  Make sure the environment variable `JAVA_HOME` points to the JDK
- `curl` to download dependencies

[machine]: https://sap.github.io/SapMachine/

## Setup

1. Clone/download the repo
1. Run `bootstrap.sh`

## How to use

1. Copy-paste your script into `script.groovy`
1. Adapt `execute.groovy` to:
   - Setup the test message
   - Change the log output
   - Add assertions
   - ...
1. `./run.sh`\
   The first run downloads additional dependencies (cached for subsequent runs). Be patient :wink:

## Notes

This project only implements a limited subset of the [Scripting API][api] of SCPI.
Check the classes in the `impl` subfolder for details.

[api]: https://help.sap.com/viewer/368c481cd6954bdfa5d0435479fd4eaf/LATEST/en-US/c5c7933b77ba46dbaa9a2c1576dbb381.html
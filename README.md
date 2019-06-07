# liberty-maven-plugin-example

```powershell

Set-Item Env:LIBERTY_HOME "C:\Program Files\wlp"

mvn -P liberty clean verify
mvn -P liberty liberty:start-server

Invoke-WebRequest http://localhost:9080/acme/ping -UseBasicParsing
Invoke-WebRequest http://localhost:9080/acme/pong -UseBasicParsing

mvn -P liberty liberty:stop-server

```

# liberty-maven-plugin-example

```powershell

Set-Item Env:LIBERTY_HOME "C:\Program Files\wlp"

mvn clean package
mvn liberty:start-server

Invoke-WebRequest http://localhost:9080/acme/ping -UseBasicParsing
Invoke-WebRequest http://localhost:9080/acme/pong -UseBasicParsing

mvn liberty:stop-server

```

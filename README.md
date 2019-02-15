# liberty-maven-plugin-example

```powershell

Set-Item Env:LIBERTY_HOME "C:\Program Files\wlp"

mvn clean package
mvn liberty:start-server

Invoke-WebRequest http://localhost:9080/acme/ping
Invoke-WebRequest http://localhost:9080/acme/pong

mvn liberty:stop-server

```

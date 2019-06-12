# liberty-maven-plugin-example

## Build-run-debugging Cycle

```powershell
mvn clean package liberty:start-server

Invoke-WebRequest http://localhost:9080/acme/ping -UseBasicParsing
Invoke-WebRequest http://localhost:9080/acme/pong -UseBasicParsing

Invoke-WebRequest http://localhost:9080/acme/hello?name=Liberty -UseBasicParsing

mvn liberty:stop-server
```

## Functional Testing with Arquillian

```powershell
mvn clean verify
```

# liberty-maven-plugin-example

## Start/Stop Server

```powershell
mvn clean package liberty:start-server

Invoke-WebRequest http://localhost:9080/acme/ping -UseBasicParsing
Invoke-WebRequest http://localhost:9080/acme/pong -UseBasicParsing

Invoke-WebRequest http://localhost:9080/acme/hello?name=Liberty -UseBasicParsing

mvn liberty:stop-server
```

## Debug Server

```powershell
mvn clean package liberty:debug-server
```

## Run Unit Tests

```powershell
mvn clean test
```

## Run Integration Tests

```powershell
mvn clean verify
```

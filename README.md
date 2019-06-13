# liberty-maven-plugin-example

## Start/Stop Server

```powershell
mvn clean package liberty:start-server

Invoke-WebRequest http://localhost:9080/ping -UseBasicParsing
Invoke-WebRequest http://localhost:9080/pong -UseBasicParsing

Invoke-WebRequest http://localhost:9080/hello?name=Liberty -UseBasicParsing

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
mvn clean verify -P arquillian
```

# Alticci Sequence

This project uses Quarkus, the Supersonic Subatomic Java Framework.

## Running the application

### Pre-requisites:
```text
* Java 11
* Docker
```

### Windows
```shell script
sh start.sh
```

### Unix
```bat
start.exe
```

> **_NOTE:_**  Swagger UI is available on: http://localhost:8080/q/swagger-ui/

## Running manually

The application can be packaged using:
```shell script
./mvnw clean package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _quarkus-run.jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _alticci.jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=alticci-jar
```

The application, packaged as an _alticci-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/alticci-1.0-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

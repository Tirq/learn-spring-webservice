# spring-restfull-web-service
This guide walks you through the process of creating a "hello world" RESTful web service with Spring. This example is based on the Spring guides, available in https://spring.io/guides/gs/rest-service/. 

## Build and Run project
To build this project, you need to have Gradle installed in your system because I decided to not use the Gradle wrapper commands.

In the root of the project execute:
```
gradle build
```
And then to start the embedded server execute:
```
java -jar build/libs/two-web-service-0.1.0.jar
```
The name of the jar is declared in the _build.gradle_ file in the _bootJar_ section. 


## Hello World

This project creates a web service who returns the below content, the _world_ default word can be changed using a param called _name_. 
```
{"id":1,"content":"Hello, World!"}
```
To get this JSON representation, you need an HTTP GET request to the following address.
```
http://localhost:8080/greeting
```
Or if you want to return a custom message, you can do using the _name_ param
```
http://localhost:8080/greeting?name=Seedorf
```
```
{"id":2,"content":"Hello, Seedorf!"}
```


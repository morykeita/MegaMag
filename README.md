# MegaMag

Forbes Magazine Take home application.

### Prerequisites

```
Java 8
Maven
```

## Running the application

The application is set to run on your local machine on port 8080.
These instructions will get you a copy of the project up and running on your local machine .

Navigate inside the application folder, where the pom.xml file lies and execute the following commands


```
mvn install
java -jar target/ForbesApplication-0.0.1-SNAPSHOT.jar
```

### Tech Stack

```
Java 8
Spring Boot (Spring data jpa)
AngularJS
H2 in memory database
```

### TO DO

```
Add more unit and integration test cases
Mocking restfull endpoints
creating separate classes for Article and Author
Dockerize the application
decouple AngularJS frontend by creating services and providers.
More refactoring
```
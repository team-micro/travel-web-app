# User Service

<<<<<<< Updated upstream
This is the class handling the backend of a `Web Travel Application` that aggregates and integrates
the following classes `Recommendation`, `Review`, `Destination`

## Project Structure
=======
This is the class handling the backend of a `Web Travel Application` that aggregates and integrates the following
classes `Recommendation`, `Review`, `Destination`

## Project Structure

>>>>>>> Stashed changes
```bash
.
├── build.log
├── build.sh
├── docker-compose.yml
├── Dockerfile
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── hcl
│   │   │           └── userservice
│   │   │               ├── controller
│   │   │               │   └── UserController.java
│   │   │               ├── model
│   │   │               │   ├── Destination.java
│   │   │               │   ├── Recommendation.java
│   │   │               │   ├── Review.java
│   │   │               │   └── User.java
│   │   │               ├── respository
│   │   │               │   └── UserRepository.java
│   │   │               └── UserServiceApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       ├── _beans.xml
│   │       ├── uscities.csv
<<<<<<< Updated upstream
│   │       ├── user.json
=======
│   │       ├── users.json
>>>>>>> Stashed changes
│   │       └── user_table_schema.sql
│   └── test
│       └── java
│           └── com
│               └── hcl
│                   └── travelcompositeservice
│                       └── UserServiceApplicationTests.java
├── startup.sh
├── target
│   ├── classes
│   │   ├── application.properties
│   │   ├── _beans.xml
│   │   ├── com
│   │   │   └── hcl
│   │   │       └── userservice
│   │   │           ├── controller
│   │   │           │   └── UserController.class
│   │   │           ├── model
│   │   │           │   ├── Destination.class
│   │   │           │   ├── Recommendation.class
│   │   │           │   ├── Review.class
│   │   │           │   └── User.class
│   │   │           ├── respository
│   │   │           │   └── UserRepository.class
│   │   │           └── UserServiceApplication.class
│   │   ├── uscities.csv
<<<<<<< Updated upstream
│   │   ├── user.json
=======
│   │   ├── users.json
>>>>>>> Stashed changes
│   │   └── user_table_schema.sql
│   ├── generated-sources
│   │   └── annotations
│   ├── maven-archiver
│   │   └── pom.properties
│   ├── maven-status
│   │   └── maven-compiler-plugin
│   │       └── compile
│   │           └── default-compile
│   │               ├── createdFiles.lst
│   │               └── inputFiles.lst
│   ├── UserService-0.0.1-SNAPSHOT.jar
│   └── UserService-0.0.1-SNAPSHOT.jar.original
└── UserService.iml

```

## Dependencies
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
- MySQL
- Java JDK 11
- Maven

<<<<<<< Updated upstream


## Installation & Deployment using Maven & Docker on Linux
### Preflight Checklist
Make sure to have installed all of the following beforehand
=======
## Installation & Deployment using Maven & Docker on Linux

### Preflight Checklist

Make sure to have installed all of the following beforehand

>>>>>>> Stashed changes
- Docker: https://phoenixnap.com/kb/how-to-install-docker-on-ubuntu-18-04
- MySQL
- Maven
- JDK 11

### Compile for Containerization
<<<<<<< Updated upstream
1. Within the project root, use `maven` to clean and run the build to compile the application to create the `JAR` file 
=======

1. Within the project root, use `maven` to clean and run the build to compile the application to create the `JAR` file

>>>>>>> Stashed changes
```bash
# remove maven artifacts generated from prior build runs
mvn clean
# compile the code and package for distribution
mvn package
# alternative method that ignores test issues
mvn package -Dmaven.test.failure.ignore=true -Dmaven.test.skip=true 

```
<<<<<<< Updated upstream
2. Check the status of `Docker` and start it up if it isn't active
=======

2. Check the status of `Docker` and start it up if it isn't active

>>>>>>> Stashed changes
```bash
# check docker status
docker info

# start up docker
service docker info

# restart docker if needed
service docker restart
```
<<<<<<< Updated upstream
3. Update  
4. 

5. 

## REST API Documentation
Documentation follows `Spring REST API` using `OpenAPI 3.0`. REST API Documentation routing is configured inside of the `application.properties` file. To view the documentation via the browser do the following
1. Run the Spring REST API Application using from the root project directory
```bash
mvn spring-boot:run
```
2. Navigate to the REST API documentation using the browser
- [Click here](http://localhost:8080/api-docs/) following for a JSON REST API view 
- [Click here](http://localhost:8080/swagger-ui-custom.html) following for an improved UI of the REST API documentation 

## Maven Setup
=======

3. Run the `startup.sh` or use `docker`

```bash
# startup script
bash startup.sh

# docker method
docker pull henrylao/user-service:latest
docker run henrylao/user-service:latest

```

## REST API Documentation

Documentation follows `Spring REST API` using `OpenAPI 3.0`. REST API Documentation routing is configured inside of
the `application.properties` file. To view the documentation via the browser do the following

1. Run the Spring REST API Application using from the root project directory

```bash
mvn spring-boot:run
```

2. Navigate to the REST API documentation using the browser

- [Click here](http://localhost:8080/api-docs/) following for a JSON REST API view
- [Click here](http://localhost:8080/swagger-ui-custom.html) following for an improved UI of the REST API documentation

## Maven Setup

>>>>>>> Stashed changes
```
mvn clean
mvn compile
```

<<<<<<< Updated upstream

## References
- Spring Java REST API using OpenAPI 3.0: https://www.baeldung.com/spring-rest-openapi-documentation

=======
## References

- Spring Java REST API using OpenAPI 3.0: https://www.baeldung.com/spring-rest-openapi-documentation
- OAuth2: https://spring.io/guides/tutorials/spring-boot-oauth2/
>>>>>>> Stashed changes


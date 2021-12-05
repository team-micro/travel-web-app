# User Service

This is the class handling the backend of a `Web Travel Application` that aggregates and integrates
the following classes `Recommendation`, `Review`, `Destination`

## Project Structure
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
│   │       ├── user.json
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
│   │   ├── user.json
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
- MySQL
- Java JDK 11
- Maven



## Installation & Deployment using Maven & Docker on Linux
### Preflight Checklist
Make sure to have installed all of the following beforehand
- Docker: https://phoenixnap.com/kb/how-to-install-docker-on-ubuntu-18-04
- MySQL
- Maven
- JDK 11

### Compile for Containerization
1. Within the project root, use `maven` to clean and run the build to compile the application to create the `JAR` file 
```bash
# remove maven artifacts generated from prior build runs
mvn clean
# compile the code and package for distribution
mvn package
# alternative method that ignores test issues
mvn package -Dmaven.test.failure.ignore=true -Dmaven.test.skip=true 

```
2. Check the status of `Docker` and start it up if it isn't active
```bash
# check docker status
docker info

# start up docker
service docker info

# restart docker if needed
service docker restart
```
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
```
mvn clean
mvn compile
```


## References
- Spring Java REST API using OpenAPI 3.0: https://www.baeldung.com/spring-rest-openapi-documentation



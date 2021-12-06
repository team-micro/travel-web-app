# User Service

This is the class handling the backend of a `Web Travel Application` that aggregates and integrates
the following classes `Recommendation`, `Review`, `Destination`

## Project Structure
```bash
UserService/
├── build.log
├── build.sh
├── clean.sh
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
│   │   │           └── springboot
│   │   │               ├── controller
│   │   │               │   └── UserController.java
│   │   │               ├── model
│   │   │               │   ├── Destination.java
│   │   │               │   ├── Recommendation.java
│   │   │               │   ├── Review.java
│   │   │               │   ├── Reviews.java
│   │   │               │   └── User.java
│   │   │               ├── respository
│   │   │               │   └── UserRepository.java
│   │   │               ├── security
│   │   │               ├── service
│   │   │               ├── user
│   │   │               └── UserServiceApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       ├── destination
│   │       │   ├── destination_schema.sql
│   │       │   ├── destinations-notebook.ipynb
│   │       │   ├── generate_sql_destination.py
│   │       │   ├── test_destinations.sql
│   │       │   └── uscities.csv
│   │       ├── recommendation
│   │       ├── review
│   │       │   ├── generate_sql_review.py
│   │       │   ├── review_table_schema.sql
│   │       │   └── test_reviews.sql
│   │       └── user
│   │           ├── _beans.xml
│   │           ├── generate_sql_users.py
│   │           ├── test_users.sql
│   │           ├── user.json
│   │           ├── users.json
│   │           └── user_table_schema.sql
│   └── test
│       ├── gen_test.py
│       └── java
│           └── com
│               └── hcl
│                   ├── rest
│                   │   └── api
│                   └── springboot
│                       └── UserServiceApplicationTests.java
├── startup.sh
├── target
│   ├── classes
│   │   ├── application.properties
│   │   ├── com
│   │   │   └── hcl
│   │   │       └── springboot
│   │   │           └── user
│   │   │               ├── controller
│   │   │               │   ├── _UserController_BREAKING.class
│   │   │               │   └── UserController.class
│   │   │               ├── model
│   │   │               │   ├── Destination.class
│   │   │               │   ├── Recommendation.class
│   │   │               │   ├── Review.class
│   │   │               │   ├── Reviews.class
│   │   │               │   └── User.class
│   │   │               ├── respository
│   │   │               │   └── UserRepository.class
│   │   │               └── UserServiceApplication.class
│   │   ├── review
│   │   │   ├── generate_sql_review.py
│   │   │   ├── review_table_schema.sql
│   │   │   └── test_reviews.sql
│   │   ├── uscities.csv
│   │   └── user
│   │       ├── _beans.xml
│   │       ├── generate_sql_users.py
│   │       ├── test_users.sql
│   │       ├── user.json
│   │       ├── users.json
│   │       └── user_table_schema.sql
│   ├── generated-sources
│   │   └── annotations
│   ├── generated-test-sources
│   │   └── test-annotations
│   └── test-classes
│       └── com
│           └── hcl
│               └── springboot
│                   └── user
│                       └── UserServiceApplicationTests.class
└── UserService.iml

```

## Dependencies
- MySQL
- Java JDK 11
- Maven


## Installation & Deployment using Maven & Docker on Linux
### Preflight Checklist
Make sure to have installed all of the following beforehand

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

```
mvn clean
mvn compile
```

## References
- Spring Java REST API using OpenAPI 3.0: https://www.baeldung.com/spring-rest-openapi-documentation
- OAuth2: https://spring.io/guides/tutorials/spring-boot-oauth2/
- Project structure: https://medium.com/the-resonant-web/spring-boot-2-0-project-structure-and-best-practices-part-2-7137bdcba7d3

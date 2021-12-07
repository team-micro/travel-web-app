# Travel Application using Microservices
## Overview
A travel application implemented using a microservice-based approach to build modular and scalable backend web-services to be ready to be deployed to the cloud 
## Project Structure
```
.
├── DestinationService
│   ├── src
│   │   ├── main
│   │   └── test
│   └── target
│       ├── classes
│       ├── generated-sources
│       ├── generated-test-sources
│       └── test-classes
├── docs
├── EurekaService
│   ├── src
│   │   ├── main
│   │   └── test
│   └── target
│       ├── classes
│       ├── generated-sources
│       ├── generated-test-sources
│       └── test-classes
├── EurekaServiceRegistry
├── RecommendService
│   ├── src
│   │   ├── main
│   │   └── test
│   └── target
│       ├── classes
│       ├── generated-sources
│       ├── generated-test-sources
│       └── test-classes
├── ReviewService
│   ├── src
│   │   ├── main
│   │   └── test
│   └── target
│       ├── classes
│       ├── generated-sources
│       ├── generated-test-sources
│       └── test-classes
└── UserService
    ├── src
    │   ├── main
    │   └── test
    └── target
        ├── classes
        ├── generated-sources
        ├── generated-test-sources
        ├── maven-archiver
        ├── maven-status
        ├── surefire-reports
        └── test-classes

```

## Dependencies
- Spring Boot
- Java JDK 11
- MySQL

## Setup

## Testing
The most up-to-date test data generation and SQL script generation are currently found in the `./UserService/test` directory. Test data generation scripts can also be found in the other Service modules; however, cannot be verified to be working. 

## References


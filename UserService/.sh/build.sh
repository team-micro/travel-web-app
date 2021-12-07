# Run with testing
mvn clean && mvn package

# Clean and run w/o testing
#mvn clean && mvn package -Dmaven.test.failure.ignore=true -Dmaven.test.skip=true

# Build image and test run in container
docker build -t henrylao/user-service:latest .
docker push henrylao/user-service:latest
#docker run henrylao/user-service:latest

## WARNING:
## unsafe checking of successful in build
#if docker ps --latest | grep user-service:latest;
#then
#    echo $(docker ps --latest | grep henry)
#    exit 0
#else
#    echo $(docker ps --latest | grep henry)
#    exit 1
#fi
#
#

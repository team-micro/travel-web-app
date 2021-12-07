# 1. Run Maven commands by selecting from the following
# Run with testing
mvn clean && mvn package

# Clean and run w/o testing
#mvn clean && mvn package -Dmaven.test.failure.ignore=true -Dmaven.test.skip=true

# 2. Build image and test run in container
docker build -t henrylao/user-service:latest .
docker push henrylao/user-service:latest

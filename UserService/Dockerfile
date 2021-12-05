FROM openjdk:11-jre-slim
ADD ./target/UserService-0.0.1-SNAPSHOT.jar UserService-0.0.1-SNAPSHOT.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "UserService-0.0.1-SNAPSHOT.jar"]
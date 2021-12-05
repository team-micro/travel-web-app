FROM openjdk:11-jre-slim
ADD target/ReviewService-0.0.2-SNAPSHOT.jar ReviewService-0.0.2-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "ReviewService-0.0.2-SNAPSHOT.jar"]
FROM openjdk:17.0.1-jdk-slim

WORKDIR /app

COPY target/recap-new.jar recap-new.jar

CMD ["java","-jar","recap-new.jar"]
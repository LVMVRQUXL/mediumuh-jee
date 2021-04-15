# Stage 1 : Build
FROM maven:3.6-jdk-11-slim AS build
WORKDIR /user
COPY . .
RUN mvn clean package -f pom.xml

# Stage 2 : Production image
FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /user/target/mediumuh-*-jar-with-dependencies.jar ./application.jar
CMD java -jar ./application.jar
FROM openjdk:17-alpine3.14
WORKDIR app/
COPY . .
RUN  ./mvnw clean package
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "target/spring-collab.jar"]



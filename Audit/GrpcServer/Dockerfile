# syntax=docker/dockerfile:1

FROM openjdk:11
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
ARG JAR_FILE=/target/GrpcServer-2.1.1.jar
COPY ${JAR_FILE} /app.jar
EXPOSE 8080
CMD docker run -p 8080:9091/tcp
ENTRYPOINT ["java","-jar","/app.jar"]


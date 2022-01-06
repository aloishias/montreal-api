FROM openjdk:11
MAINTAINER aloishias
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} montreal-api.jar
ENTRYPOINT ["java","-jar","/montreal-api.jar"]
EXPOSE 9090

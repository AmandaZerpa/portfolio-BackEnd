FROM amazoncorretto:17-alpine-jdk
MAINTAINER AmandaZerpa
COPY target/SpringBoot-0.0.1-SNAPSHOT.jar azportafolio-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/azportafolio-app.jar"]

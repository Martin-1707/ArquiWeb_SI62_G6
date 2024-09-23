FROM amazoncorretto:21
MAINTAINER ESMERALDA
COPY target/Project_Security_G06-0.0.1-SNAPSHOT.jar GiftServiceBackend.jar
ENTRYPOINT ["java", "-jar","/security_g06.jar"]
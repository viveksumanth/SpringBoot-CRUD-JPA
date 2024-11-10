# current docker image has dependency on jdk image.
FROM openjdk:17-jdk-slim

#Information around who maintains the image.
LABEL "org.opencontainers.image.authors"="viveksumanth.com"

# copy from target repo to docker image - add jar to image.
COPY target/crud-restapi-sql-0.0.1-SNAPSHOT.jar crud-restapi-sql-0.0.1-SNAPSHOT.jar

# execute the application.
ENTRYPOINT ["java", "-jar", "crud-restapi-sql-0.0.1-SNAPSHOT.jar"]
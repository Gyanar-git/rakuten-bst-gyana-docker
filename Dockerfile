# For Java 8, try this
FROM openjdk:8

# For Java 11, try this
# FROM adoptopenjdk/openjdk11:alpine-jre

# Refer to Maven build -> finalName
ARG JAR_FILE=target/rakuten-bst-gyana-0.0.1-SNAPSHOT.jar

# cd /opt/app
WORKDIR /tmp

# cp target/rakuten-bst-gyana-0.0.1-SNAPSHOT.jar /opt/app/rakuten-bst-gyana-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} rakuten-bst-gyana-0.0.1-SNAPSHOT.jar
EXPOSE 8085

ENTRYPOINT ["java","-jar","rakuten-bst-gyana-0.0.1-SNAPSHOT.jar"]

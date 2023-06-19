FROM maven:3.6-jdk-11 AS builder

COPY ./pom.xml ./pom.xml
COPY src ./src/

ENV MAVEN_OPTS='-Xmx6g'
RUN mvn clean package

RUN ls -l target/

###########

FROM openjdk:11.0.16-slim

RUN apt-get update && apt-get install -y curl

COPY --from=builder target/test.server.graphql.folker-test-graphql-test-server-1.0-SNAPSHOT.jar ./graphql-server.jar

EXPOSE 8682

CMD [ "java", "-jar", "graphql-server.jar" ]
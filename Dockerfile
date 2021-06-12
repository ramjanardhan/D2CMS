FROM openjdk:8-jdk-alpine
VOLUME /tmp
copy ./target/d2c-0.0.1-SNAPSHOT.jar d2c.jar
CMD ["java","-jar","d2c.jar"]
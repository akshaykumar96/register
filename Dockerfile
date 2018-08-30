FROM openjdk:8-jre-alpine
COPY ./target/register-0.0.1-SNAPSHOT.jar /usr/src/register/
WORKDIR /usr/src/register
EXPOSE 9006
CMD ["java", "-jar", "register-0.0.1-SNAPSHOT.jar"]
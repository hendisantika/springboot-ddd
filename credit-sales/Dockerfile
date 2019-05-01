FROM openjdk:8-jdk-alpine
MAINTAINER Hendi Snatika "hendisantika@yahoo.co.id"
VOLUME /tmp
ENV SPRING_APPLICATION_JSON='{"spring": {"rabbitmq": {"host": "localrabbit", "addresses": "rabbit-mq"}}}'
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar
EXPOSE 9001
ADD target/credit-sales-0.0.1-SNAPSHOT.jar app.jar


FROM eclipse-temurin:17-jdk-ubi9-minimal
WORKDIR /opt
COPY target/*.jar /opt/app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar

FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} /app.jar
ENV CONTAINER_NAME=lab_java_aws_project01
ENTRYPOINT ["java", "-jar", "/app.jar"]
RUN echo "Copying JAR from ${JAR_FILE}"


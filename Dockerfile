FROM eclipse-temurin:17-jdk-focal
WORKDIR /app
COPY target/metrics-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENV JAVA_TOOL_OPTIONS="-XX:+UseG1GC -Xmx512m -Xms256m -Dspring.jmx.enabled=false"
CMD ["java", "-jar", "app.jar"]
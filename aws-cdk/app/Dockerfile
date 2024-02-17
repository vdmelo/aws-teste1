# Set up build image
FROM maven:3.9.6-amazoncorretto-21 as BUILDER
WORKDIR ../..

# Copy source files to project
# COPY . .

# Build the application
RUN mvn -v
RUN mvn clean package -f spring-app-teste

# ---- Package ---- #

# Create the runtime image
FROM amazoncorretto:21-alpine-jdk

# Copy the built jar file to the runtime image
COPY --from=BUILDER /build/app/target/app-1.0-SNAPSHOT-jar-with-dependencies.jar /app/app.jar

EXPOSE 8080

# Set the entrypoint
CMD ["java", "-jar", "/app/app.jar"]
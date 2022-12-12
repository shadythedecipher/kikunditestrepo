FROM openjdk:8-jdk-alpine

# Set the working directory to /kikundi
WORKDIR /src

# Copy the current directory contents into the container at /app
COPY . /src

# Build the application
RUN ./gradlew build

# Run the built application
CMD ["java", "-jar", "build/libs/kikundi-0.0.1-SNAPSHOT.jar"]

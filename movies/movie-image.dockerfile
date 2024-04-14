FROM maven:3-openjdk-11
# Set working directory
WORKDIR /usr/src/app

# Copy the project files into the container
COPY . .

# Run Maven build skipping tests
RUN mvn clean package

# Specify the command to run the application
CMD ["java","-jar","target/movies-0.0.1-SNAPSHOT.jar"]
FROM amazoncorretto:11
VOLUME /app

COPY target/movies-0.0.1-SNAPSHOT.jar movies.jar

# ENV DB_URL=jdbc:postgresql://filmproba.cps8uueyypv4.eu-central-1.rds.amazonaws.com:5432/postgres
# ENV DB_USERNAME=postgres
# ENV DB_PASSWORD=postgres
# ENV DB_DDL=none

EXPOSE 8080
CMD ["java", "-jar", "movies.jar"]
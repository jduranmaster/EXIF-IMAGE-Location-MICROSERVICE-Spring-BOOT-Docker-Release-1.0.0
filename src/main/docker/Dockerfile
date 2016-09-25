FROM java:8
VOLUME /tmp
ADD exif-image-location-microservice-spring-boot-1.0.0-1.0.0-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8993
ENTRYPOINT ["java","-Dspring.profiles.active=https","-jar","/app.jar","--server.port=8993"]
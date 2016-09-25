# EXIF-IMAGE-Location-MICROSERVICE-Spring-BOOT-Docker-Release-1.0.0

EXIF-IMAGE-Location-MICROSERVICE-Spring-BOOT-Docker-Release-1.0.0

![Title](./exec-tests/x-logo-poc.jpg)

This POC allows to deploy a MicroService that returns the geo-tag info given the latitude and the longitude as input data.
The MicroService uses a local CSV data extraction that includes geo-location data moreover cities and countries names.

The project builds a Spring-Boot application that can invoked using the following input parameters:

1. Launch the MicroService in HTTP-connection-mode:

java -jar exif-image-location-microservice-spring-boot-1.0.0-1.0.0-SNAPSHOT.jar --server.port=8088

2. Launch the MicroService in HTTPS-connection-mode:

java -Dspring.profiles.active=https -jar exif-image-location-microservice-spring-boot-1.0.0-1.0.0-SNAPSHOT.jar --server.port=8999

The project also allows to deploy the MicroService in a Docker-Image. To do so just use the following compilation command in 
your IDE: clean install -Pdockerize-desarrollo. Probably you must change some docker config parameters in both the Docker-file and POM.xml.

The tipical request/response of the Microservice looks like the following:

REQUEST: https://localhost:8999/location?lat=40.415363&long=-3.707398
RESPONSE: {"countrycode":"ES","city":"Chamartín","asciiname":"Chamartin","latitude":40.46206,"longitude":-3.6766,"population":140000,"elevation":685,"timezone":"Europe/Madrid","modified":"2014-01-13"}
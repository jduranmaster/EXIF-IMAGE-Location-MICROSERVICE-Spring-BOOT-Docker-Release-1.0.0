package com.epsilon.metadata.image.location;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.epsilon.metadata.image.location")
@SpringBootApplication
public class GeoTagLocationApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeoTagLocationApplication.class, args);
    }
}

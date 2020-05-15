package org.caps.privider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PrividerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrividerApplication.class, args);
    }

}

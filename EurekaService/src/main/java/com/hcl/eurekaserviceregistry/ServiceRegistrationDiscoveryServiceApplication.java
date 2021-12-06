package com.hcl.eurekaserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistrationDiscoveryServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(
                ServiceRegistrationDiscoveryServiceApplication.class, args);
    }

}

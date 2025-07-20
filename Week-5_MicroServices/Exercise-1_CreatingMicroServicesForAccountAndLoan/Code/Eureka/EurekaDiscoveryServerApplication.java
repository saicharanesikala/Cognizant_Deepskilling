package com.cognizant.eureka_discovery_server;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDiscoveryServerApplication 

{

	public static void main(String[] args) {
		SpringApplication.run(EurekaDiscoveryServerApplication.class, args);
	}

}

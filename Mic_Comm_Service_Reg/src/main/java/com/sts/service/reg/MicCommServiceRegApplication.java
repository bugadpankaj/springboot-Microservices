package com.sts.service.reg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaServer
public class MicCommServiceRegApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicCommServiceRegApplication.class, args);
	}
	
	 @Bean @LoadBalanced
	    public RestTemplate getRestTemplate() {
	        return new RestTemplate();
	    }

}

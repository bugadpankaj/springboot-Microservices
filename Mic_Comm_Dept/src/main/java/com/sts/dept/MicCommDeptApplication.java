package com.sts.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicCommDeptApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicCommDeptApplication.class, args);
	}

}

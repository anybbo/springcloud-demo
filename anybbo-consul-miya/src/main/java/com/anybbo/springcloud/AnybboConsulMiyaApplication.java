package com.anybbo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class AnybboConsulMiyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnybboConsulMiyaApplication.class, args);
	}

	@RequestMapping("/hi")
	public String home() {
		return "hi ,i'm miya";
	}
}

package com.anybbo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class AnybboConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnybboConfigServerApplication.class, args);
	}
}

package com.anybbo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class AnybboServerZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnybboServerZipkinApplication.class, args);
	}
}

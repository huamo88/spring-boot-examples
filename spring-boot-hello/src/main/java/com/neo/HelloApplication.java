package com.neo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		System.out.println("启动项目Spring");
		System.out.println("启动项目Spring2019.08.07");
		SpringApplication.run(HelloApplication.class, args);
	}
}

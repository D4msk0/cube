package com.damsko.cube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.damsko.cube")
public class CubeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CubeApplication.class, args);
	}

}

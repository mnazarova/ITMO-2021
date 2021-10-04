package com.itmo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Itmo2021DemoApplication {

	@GetMapping("/")
	public  String index() {
		return "Hello, ITMO-2021! We deployed the project!!! ;) ";
	}

	public static void main(String[] args) {
		SpringApplication.run(Itmo2021DemoApplication.class, args);
	}

}

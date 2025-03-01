package com.backend.BL_task1_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BlTask1SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlTask1SpringbootApplication.class, args);
	}
}

@RestController
class HelloController {

	@GetMapping
	public String sayHello() {
		return "Hello, World!";
	}
}

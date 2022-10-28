package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// makes class eligible for incoming REST calls
@RestController
public class HftdemoApplication {

	@RequestMapping("/")
	public String sayHello(){

		return "Good morning lovely people of HfT Stuttgart";
	}

	

	public static void main(String[] args) {
		SpringApplication.run(HftdemoApplication.class, args);
	}

}

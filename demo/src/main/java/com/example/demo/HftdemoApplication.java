package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// makes class eligible for incoming REST calls
@RestController
public class HftdemoApplication {

	private String privateProperty = "unset";

	//@RequestMapping("/")
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String sayHello(){

		return "Good morning lovely people of HfT Stuttgart";
	}

	@GetMapping("/helloTo/{name}")
	public String sayHelloTo(@PathVariable String name){

		privateProperty = name;
		return "Hello: "+name;
	}

	// @PostMapping("/somePath") equivalent to
	// @RequestMapping(value = "/somePath", method = RequestMethod.POST)

	@GetMapping("/helloAgain")
	public String sayHelloAgain(){

		return "Hello fromXX another Rest endpoint";
	}

	public static void main(String[] args) {
		SpringApplication.run(HftdemoApplication.class, args);
	}

}

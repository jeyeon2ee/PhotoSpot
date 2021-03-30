package com.example.photospot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PhotospotApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotospotApplication.class, args);

	}

	@GetMapping
	public String HelloWorld(){
		return "welcome";
	}

}

package com.example.photospot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class PhotospotApplication {

	public static void main(String[] args) {
		//System.out.println("start");
		SpringApplication.run(PhotospotApplication.class, args);
	}

	@GetMapping
	public String Helloworld(){
		return ("hello world");
	}

}

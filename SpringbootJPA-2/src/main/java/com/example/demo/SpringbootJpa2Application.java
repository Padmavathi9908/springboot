package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJpa2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpa2Application.class, args);
		com.example.demo.entity.Controller c = new com.example.demo.entity.Controller();
		c.set();
	}

}

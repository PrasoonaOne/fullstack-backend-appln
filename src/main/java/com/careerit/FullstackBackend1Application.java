package com.careerit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class FullstackBackend1Application {

	public static void main(String[] args) {
		SpringApplication.run(FullstackBackend1Application.class, args);
	}

}

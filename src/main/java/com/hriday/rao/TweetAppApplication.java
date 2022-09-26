package com.hriday.rao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class TweetAppApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TweetAppApplication.class, args);
	}

}

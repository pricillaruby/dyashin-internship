package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude= {
		org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class
})
public class StudentFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentFormApplication.class, args);
	}

}

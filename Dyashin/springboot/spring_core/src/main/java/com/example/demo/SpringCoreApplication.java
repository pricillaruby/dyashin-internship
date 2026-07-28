package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreApplication implements CommandLineRunner{
	
	@Autowired
	private Chef chef;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		chef.cook();
	}

}

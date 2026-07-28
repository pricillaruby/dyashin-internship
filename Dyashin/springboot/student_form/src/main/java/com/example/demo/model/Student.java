package com.example.demo.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Student {
	@NotBlank(message="Name is required")
	@Size(min=3,message="Name must be at least 3 character")
	@Pattern(regexp="^[A-Za-z ]+$",message="Name must contain only letters and spaces")
	private String name;
	
	@NotBlank(message="Email is required")
	@Email(message="Invalid Email Format")
	private String email;
	
	@NotBlank(message="Please select a course")
	private String course;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}

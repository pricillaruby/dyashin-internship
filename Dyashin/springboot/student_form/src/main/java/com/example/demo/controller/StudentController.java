package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Student;

import jakarta.validation.Valid;


@Controller
public class StudentController {
	@GetMapping("/showForm")
	public String showForm(Model model) {
		Student student= new Student();
		List<String> courses = Arrays.asList("Java","Spring boot","React JS","Hibernate","Angular");
		
		model.addAttribute("student", student);
		model.addAttribute("courses", courses);
		
		return "student-form";
	}
	
	@PostMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute Student student,
			BindingResult result,
			Model model) {
		
		  List<String> courses = Arrays.asList("Java","Spring boot","React JS","Hibernate","Angular");
		  model.addAttribute("courses", courses);
		  
		  if(result.hasErrors()) {
			  return "student-form";
		  }
		  
		  return "student-details";
	}
}

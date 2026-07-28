package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/students")
public class StudentController {
	private final StudentService service;
	
	public StudentController(StudentService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Student> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Student getById(@PathVariable Long id) {
		return service.getById(id);
	}
	
	@PostMapping
	public Student create(@Valid @RequestBody Student student) {
		return service.create(student);
	}
	
	@PutMapping("/{id}")
	public Student update(@PathVariable Long id,@Valid @RequestBody Student student) {
		return service.update(id, student);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		service.delete(id);
		return "Student Deleted Successfully";
	}
}

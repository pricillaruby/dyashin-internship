package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;
	
	//Get all the student
	@GetMapping
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	//Get one student by id
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable Long id) {
		return studentRepository.findById(id).orElse(null);
	}
	
	//For adding new student
	@PostMapping
	public Student createStudent(@RequestBody Student student) {
		return studentRepository.save(student);
	}
	
	//for updating student
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable Long id,@RequestBody Student studentDetails) {
		Student student = studentRepository.findById(id).orElse(null);
		if(student!=null) {
			student.setName(studentDetails.getName());
			student.setEmail(studentDetails.getEmail());
			return studentRepository.save(student);
		}
		return null;
	}
	
	//Delete Student by id
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentRepository.deleteById(id);
//		studentRepository.deleteAll(); for deleting all students
		return "Student Deleted with id: "+id;
	}
}


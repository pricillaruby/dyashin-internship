package com.learning.management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.management.dto.CourseDTO;
import com.learning.management.entity.CourseEntity;
import com.learning.management.service.CourseService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/courses")
public class CourseController {
	
	private CourseService courseService;
	
	public CourseController(CourseService courseService) {
		this.courseService = courseService;
	}
	
	@PostMapping("/addcourse")
	public String addCourse(@RequestBody @Valid CourseDTO courseDTO) {
		return courseService.addCourse(courseDTO);
	}
	
	@GetMapping("/getallcourses")
	public List<CourseEntity> getAllCourses(){
		return courseService.getAllCourses();
	}
	
	@PutMapping("/updatecourse/{courseId}")
	public String updateCourse(@PathVariable int courseId,@RequestBody @Valid CourseDTO courseDTO) {
		return courseService.updateCourse(courseId,courseDTO);
	}
	
	@DeleteMapping("/deletecourse/{courseId}")
	public String deleteCourse(@PathVariable int courseId) {
		return courseService.deleteCourse(courseId);
	}
}

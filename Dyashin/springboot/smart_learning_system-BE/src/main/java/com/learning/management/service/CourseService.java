package com.learning.management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learning.management.dto.CourseDTO;
import com.learning.management.entity.CourseEntity;
import com.learning.management.exception.ResourceNotFoundException;
import com.learning.management.repository.CourseRepository;

@Service
public class CourseService {

	private CourseRepository courseRepository;
	
	public CourseService(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}
	
	public String addCourse(CourseDTO courseDTO) {
		// TODO Auto-generated method stub
		CourseEntity courseEntity = new CourseEntity();
		courseEntity.setCourseName(courseDTO.getCourseName());
		courseEntity.setCourseDescription(courseDTO.getCourseDescription());
		courseEntity.setDuration(courseDTO.getDuration());
		courseEntity.setActive(courseDTO.isActive());
		System.out.println(courseDTO.isActive());
		
		courseRepository.save(courseEntity);
		
		return "Course Details Created";
	}

	public List<CourseEntity> getAllCourses() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	public String updateCourse(int courseId, CourseDTO courseDTO) {
		// TODO Auto-generated method stub
		CourseEntity existsEntity=courseRepository.findById(courseId)
				.orElseThrow(()->new ResourceNotFoundException(courseId));
		CourseEntity updatedEntity = new CourseEntity();
		updatedEntity.setCourseId(existsEntity.getCourseId());
		updatedEntity.setCourseName(courseDTO.getCourseName());
		updatedEntity.setCourseDescription(courseDTO.getCourseDescription());
		updatedEntity.setDuration(courseDTO.getDuration());
		updatedEntity.setActive(courseDTO.isActive());
		
		courseRepository.save(updatedEntity);
		
		return "Course Details Updated";
	}

	public String deleteCourse(int courseId) {
		// TODO Auto-generated method stub
		if(courseRepository.existsById(courseId)) {
			courseRepository.deleteById(courseId);
		}else {
			throw new ResourceNotFoundException(courseId);
		}
		return "Course Details Deleted";
	}
}

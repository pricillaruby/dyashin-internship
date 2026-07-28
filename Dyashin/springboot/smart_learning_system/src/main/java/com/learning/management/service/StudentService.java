package com.learning.management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learning.management.dto.StudentDTO;
import com.learning.management.entity.StudentEntity;
import com.learning.management.exception.ResourceNotFoundException;
import com.learning.management.repository.CourseRepository;
import com.learning.management.repository.StudentRepository;

@Service
public class StudentService {
	
	private StudentRepository studentRepository;
	private CourseRepository courseRepository;
	
	public StudentService(StudentRepository studentRepository,CourseRepository courseRepository) {
		this.studentRepository = studentRepository;
		this.courseRepository = courseRepository;
	}

	public String addStudent(StudentDTO studentDTO) {
		// TODO Auto-generated method stub
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setName(studentDTO.getName());
		studentEntity.setEmail(studentDTO.getEmail());
		studentEntity.setPhoneNumber(studentDTO.getPhoneNumber());
		studentEntity.setDateOfBirth(studentDTO.getDateOfBirth());
		studentEntity.setGender(studentDTO.getGender());
		studentEntity.setProfilePicture(studentDTO.getProfilePicture());
		studentEntity.setCourseId(studentDTO.getCourseId());
		
		studentRepository.save(studentEntity);
		
		return "Student Details Created";
	}

	public List<StudentEntity> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	public StudentDTO getById(int id) {
		// TODO Auto-generated method stub
		StudentEntity studentEntity = studentRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException(id));
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setId(studentEntity.getId());
		studentDTO.setName(studentEntity.getName());
		studentDTO.setEmail(studentEntity.getEmail());
		studentDTO.setPhoneNumber(studentEntity.getPhoneNumber());
		studentDTO.setDateOfBirth(studentEntity.getDateOfBirth());
		studentDTO.setGender(studentEntity.getGender());
		studentDTO.setProfilePicture(studentEntity.getProfilePicture());
		studentDTO.setCourseId(studentEntity.getCourseId());
		
		
		if(courseRepository.findById(studentDTO.getCourseId())
				.orElseThrow(()-> new ResourceNotFoundException(studentDTO.getCourseId())) != null) {
			studentDTO.setCourse(courseRepository.findAll());
		}
		return studentDTO;
	}

	public String updateById(int id,StudentDTO studentDTO) {
		// TODO Auto-generated method stub
		StudentEntity exisitingEntity = studentRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException(id));
		StudentEntity  updatedEntity = new StudentEntity();
		updatedEntity.setId(exisitingEntity.getId());
		updatedEntity.setName(studentDTO.getName());
		updatedEntity.setEmail(studentDTO.getEmail());
		updatedEntity.setPhoneNumber(studentDTO.getPhoneNumber());
		updatedEntity.setDateOfBirth(studentDTO.getDateOfBirth());
		updatedEntity.setGender(studentDTO.getGender());
		updatedEntity.setProfilePicture(studentDTO.getProfilePicture());
		updatedEntity.setCourseId(studentDTO.getCourseId());
		studentRepository.save(updatedEntity);
		return "Student Details Updated";
	}

	public String deleteById(int id) {
		// TODO Auto-generated method stub
		if(studentRepository.existsById(id)) {
			studentRepository.deleteById(id);
		}else {
			throw new ResourceNotFoundException(id);
		}
		return "Student Details Deleted";
	}

}

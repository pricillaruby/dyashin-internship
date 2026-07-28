package com.learning.management.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;

@Entity
@Table(name = "Student")
@Builder
public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message = "Name is required")
	private String name;
	
	@Email
	@Column(unique = true)
	@NotBlank(message = "Email is required")
	private String email;
	
	@Pattern(regexp = "^(?:\\+91|0)?[6789]\\d{9}$",message="Phone number in required")
	private String phoneNumber;
	
	@Past
	private Date dateOfBirth;
	
	@NotBlank
	private String gender;
	
	private String profilePicture;
	
	@JoinColumn(name = "courseId") //Foreign Key
	private int courseId;
	
//	private List<CourseEntity> courses = new ArrayList<>();


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

//	public List<CourseEntity> getCourses() {
//		return courses;
//	}
//
//	public void setCourses(List<CourseEntity> courses) {
//		this.courses = courses;
//	}

	
}

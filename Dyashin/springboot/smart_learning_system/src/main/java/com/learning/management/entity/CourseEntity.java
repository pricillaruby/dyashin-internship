package com.learning.management.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Entity
@Table(name = "course")
@Builder
public class CourseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseId;
	
	@NotBlank(message ="Course Name is Required")
	private String courseName;
	
	@NotBlank(message = "Course Description is Required")
	private String courseDescription;
	
	@NotBlank(message = "duration is required")
	private String duration;
	
	@Column(name = "isActive")
	private boolean isActive;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseID) {
		this.courseId = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}

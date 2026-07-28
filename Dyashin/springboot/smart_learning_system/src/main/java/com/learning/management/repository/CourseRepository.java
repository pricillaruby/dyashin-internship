package com.learning.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.management.entity.CourseEntity;

public interface CourseRepository extends JpaRepository<CourseEntity,Integer>{

}

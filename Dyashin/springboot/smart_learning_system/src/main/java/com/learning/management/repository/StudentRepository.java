package com.learning.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.management.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity,Integer>{

}

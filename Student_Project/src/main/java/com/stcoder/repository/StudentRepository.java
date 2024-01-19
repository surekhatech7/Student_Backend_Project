package com.stcoder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stcoder.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}

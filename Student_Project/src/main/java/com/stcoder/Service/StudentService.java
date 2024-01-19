package com.stcoder.Service;

import java.util.List;

import com.stcoder.model.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	public List<Student> getAllStudent();
	public String deleteStudent(Integer id);
	public Student editStudent(Student student, Integer id);
}

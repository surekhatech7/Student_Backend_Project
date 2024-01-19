package com.stcoder.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stcoder.model.Student;
import com.stcoder.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public String deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		Student student = studentRepo.findById(id).get();
		
		if(student != null)
		{
			studentRepo.delete(student);
			return "student deleted successfully";
		}
		return "something wrong on server";
	}

	@Override
	public Student editStudent(Student s, Integer id) {
		// TODO Auto-generated method stub
		Student oldStudent = studentRepo.findById(id).get();
		
		oldStudent.setName(s.getName());
		oldStudent.setEmail(s.getEmail());
		oldStudent.setPhone(s.getPhone());
		
		return studentRepo.save(oldStudent);
	}

}

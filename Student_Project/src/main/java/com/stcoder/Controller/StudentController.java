package com.stcoder.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stcoder.Service.StudentService;
import com.stcoder.model.Student;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/saveStudent")
	public ResponseEntity<?> saveStudent(@RequestBody Student student){
		return new ResponseEntity<>(studentService.saveStudent(student),HttpStatus.CREATED);	
	}

	@GetMapping("/")
	  public ResponseEntity<?> getAllStudent() {
	    return new ResponseEntity<>(studentService.getAllStudent(), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	  public ResponseEntity<?> deleteStudent(@PathVariable Integer id) {
	    return new ResponseEntity<>(studentService.deleteStudent(id), HttpStatus.OK);
	  }

	  @PutMapping("/editStudent/{id}")
	  public ResponseEntity<?> editStudent(@RequestBody Student student, @PathVariable Integer id) {
	    return new ResponseEntity<>(studentService.editStudent(student, id), HttpStatus.CREATED);
	  }
}

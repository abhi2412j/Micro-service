package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Student;
import com.jbk.exception.StudentNotFoundException;
import com.jbk.model.Branch;
import com.jbk.model.Student_Branch;
import com.jbk.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService service;

	@PostMapping(value = "/saveStudent")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {

		Student std = service.saveStudent(student);
		if (std != null) {
			return new ResponseEntity<>(std, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping(value = "/getStudent/{studentId}")
	public ResponseEntity<Student> getStudent(@PathVariable String studentId) {

		Student student = service.getStudentById(studentId);
		if (student == null) {
			System.out.println("Not Found");
			throw new StudentNotFoundException("Student not found for this id");
		} 
		else {
			return new ResponseEntity<>(student, HttpStatus.OK);
		}
	}
	
	@GetMapping(value = "/getBranchById/{branchId}")
	public ResponseEntity<Branch> getBranchById(@PathVariable String branchId) {
		Branch branch=service.getBranchById(branchId);
		if (branch != null) {
			return new ResponseEntity<>(branch, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}

	}
	// biggest mistake of our generation is they run behind pretty faces and ignore good hearts
	
	@GetMapping(value = "/getStudentBranch/{studentId}")
	public ResponseEntity<Student_Branch> getStudentBranch(@PathVariable String studentId){
		Student_Branch student_Branch=service.getStudentBranch(studentId);
		if (student_Branch != null) {
			return new ResponseEntity<>(student_Branch, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
}

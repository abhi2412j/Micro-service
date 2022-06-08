package com.jbk.service;

import java.util.List;

import com.jbk.entity.Student;
import com.jbk.model.Branch;
import com.jbk.model.Student_Branch;

public interface StudentService {
	
	public Student saveStudent(Student student);
	public Student getStudentById(String studentId);
	public List<Student> getAllStudent();
	public boolean deleteStudentById(String StudentId);
	public Student updateStudent(Student student);
	public Branch getBranchById(String branchId);
	public Student_Branch getStudentBranch(String StudentId);


}

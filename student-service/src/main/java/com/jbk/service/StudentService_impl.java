package com.jbk.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jbk.dao.StudentDao;
import com.jbk.entity.Student;
import com.jbk.model.Branch;
import com.jbk.model.Student_Branch;

@Service
public class StudentService_impl implements StudentService {

	@Autowired
	private StudentDao dao;
	
	@Autowired
	private RestTemplate restTemplate;
	

	@Override
	public Student saveStudent(Student student) {
		String studentId = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		student.setStudentId(studentId);
		Student std = dao.saveStudent(student);
		return std;
	}

	@Override
	public Student getStudentById(String studentId) {
		Student student = dao.getStudentById(studentId);
		return student;
	}

	@Override
	public List<Student> getAllStudent() {

		return null;
	}

	@Override
	public boolean deleteStudentById(String StudentId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Branch getBranchById(String branchId) {
		// call another microService(from another project)
		Branch branch=restTemplate.getForObject("http://localhost:8083/branch/getBranch/"+branchId, Branch.class);
		return branch;
	}

	@Override
	public Student_Branch getStudentBranch(String StudentId) {
		// TODO Auto-generated method stub
		
		Student student =restTemplate.getForObject("http://localhost:8084/student/getStudent/"+StudentId, Student.class);
		Branch branch=restTemplate.getForObject("http://localhost:8083/branch/getBranch/"+student.getBranchId(), Branch.class);
		Student_Branch student_Branch = new Student_Branch();
		student_Branch.setStudent(student);
		student_Branch.setBranch(branch);
		return student_Branch;
		
	}

}

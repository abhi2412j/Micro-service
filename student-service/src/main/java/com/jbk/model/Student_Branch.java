package com.jbk.model;

import com.jbk.entity.Student;

public class Student_Branch {
	Student student;
	Branch branch;
	
	public Student_Branch() {
		// TODO Auto-generated constructor stub
	}

	public Student_Branch(Student student, Branch branch) {
		super();
		this.student = student;
		this.branch = branch;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student_Branch [student=" + student + ", branch=" + branch + "]";
	}
	

}

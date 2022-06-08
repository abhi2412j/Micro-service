package com.jbk.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	private String studentId;
	private String studentName;
	private Long marks;
	private String branchId;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String studentId, String studentName, Long marks, String branchId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		this.branchId = branchId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Long getMarks() {
		return marks;
	}

	public void setMarks(Long marks) {
		this.marks = marks;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + ", branchId="
				+ branchId + "]";
	}
	
	
	

}

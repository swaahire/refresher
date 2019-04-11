package com.example.demoProject.model;

import org.springframework.data.annotation.Id;

public class Student {

	@Id
	String name;
	String qualification;
	int rollNo;
	long mobileNo;
	
	
	public Student() {
		
	}
	
	public Student(String name, String qualification, int rollNo, long mobileNo) {
		super();
		this.name = name;
		this.qualification = qualification;
		this.rollNo = rollNo;
		this.mobileNo = mobileNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", qualification=" + qualification + ", rollNo=" + rollNo + ", mobileNo="
				+ mobileNo + "]";
	}
	
	
	
}

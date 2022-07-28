package com.lti.beans;


public class Student {
	
	private int studentId;
	private String studentFirstName;
	private String studentLastName;
	private String studentEmail;
	private long studentPhoneNumber;
	private String studentPassword;
	private int courseId;
	
	
	public Student(int studentId, String studentFirstName, String studentLastName, String studentEmail, long studentPhoneNumber,
			String studentPassword, int courseId) {
		super();
		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentEmail = studentEmail;
		this.studentPhoneNumber = studentPhoneNumber;
		this.studentPassword = studentPassword;
		this.courseId = courseId;
	}

	public Student() {
		super();
	}

	public int getstudentId() {
		return studentId;
	}

	public void setstudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getstudentFirstName() {
		return studentFirstName;
	}

	public void setstudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getstudentLastName() {
		return studentLastName;
	}

	public void setstudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getstudentEmail() {
		return studentEmail;
	}

	public void setstudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public long getstudentPhoneNumber() {
		return studentPhoneNumber;
	}

	public void setstudentPhoneNumber(long studentPhoneNumber) {
		this.studentPhoneNumber = studentPhoneNumber;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	public String getstudentPassword() {
		return studentPassword;
	}

	public void setstudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

	@Override
	public String toString() {
		return "student [studentId=" + studentId + ", studentFirstName=" + studentFirstName + ", studentLastName=" + studentLastName
				+ ", studentEmail=" + studentEmail + ", studentPhoneNumber=" + studentPhoneNumber + ", studentPassword=" + studentPassword
				+ ", courseId=" + courseId + "]";
	}
	
}

package com.lti.beans;

public class Course {
	
	private int courseId;
	private String courseName;
	private int courseTotalMarks;
	private int coursePassingMarks;
	private static int courseDuration = 90;
	
	public Course(int courseId, String courseName, int courseTotalMarks, int coursePassingMarks) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseTotalMarks = courseTotalMarks;
		this.coursePassingMarks = coursePassingMarks;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseTotalMarks() {
		return courseTotalMarks;
	}

	public void setCourseTotalMarks(int courseTotalMarks) {
		this.courseTotalMarks = courseTotalMarks;
	}

	public int getCoursePassingMarks() {
		return coursePassingMarks;
	}

	public void setCoursePassingMarks(int coursePassingMarks) {
		this.coursePassingMarks = coursePassingMarks;
	}

	public static int getCourseDuration() {
		return courseDuration;
	}

	public static void setCourseDuration(int courseDuration) {
		Course.courseDuration = courseDuration;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseTotalMarks=" + courseTotalMarks
				+ ", coursePassingMarks=" + coursePassingMarks + "]";
	}
	
}

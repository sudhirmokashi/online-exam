package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COURSE")
public class Course {
	
	@Id
	@Column(name="COURSE_ID")
	private int courseId;
	
	@Column(name="COURSE_NAME")
	private String courseName;
	
	@Column(name="COURSE_TOTAL_MARKS")
	private int courseTotalMarks;
	
	@Column(name="COURSE_PASS_MARKS")
	private int coursePassingMarks;
	
	@Column(name="COURSE_DURATION")
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

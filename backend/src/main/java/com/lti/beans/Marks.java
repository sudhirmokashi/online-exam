package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MARKS")
public class Marks {
	
	@Id
	@Column(name="STU_ID")
	private int studentId;
	
	@Column(name="SCORE")
	private int score;
	
	@Column(name="COURSE_ID")
	private int courseId;
	
	public Marks(int studentId, int score, int courseId) {
		super();
		this.studentId = studentId;
		this.score = score;
		this.courseId = courseId;
	}

	public Marks() {
		super();
	}

	public int getstudentId() {
		return studentId;
	}

	public void setstudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "Marks [studentId=" + studentId + ", score=" + score + ", courseId=" + courseId + "]";
	}
	
}

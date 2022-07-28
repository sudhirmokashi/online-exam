package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.lti.dao.Question;

@Entity
@Table(name="QUESTION_JAVA_LEVEL_2")
public class QuestionJavaLevel2 implements Question{

	@Id
	@Column(name="QUESTION_ID")
	private int questionId;
	@Column(name="QUESTION_DESCRIPTION")
	private String questionDesc;
	@Column(name="QUESTION_OPTION_A")
	private String questionOptionA;
	@Column(name="QUESTION_OPTION_B")
	private String questionOptionB;
	@Column(name="QUESTION_ANSWER")
	private String questionAnswer;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestionDesc() {
		return questionDesc;
	}
	public void setQuestionDesc(String questionDesc) {
		this.questionDesc = questionDesc;
	}
	public String getQuestionOptionA() {
		return questionOptionA;
	}
	public void setQuestionOptionA(String questionOptionA) {
		this.questionOptionA = questionOptionA;
	}
	public String getQuestionOptionB() {
		return questionOptionB;
	}
	public void setQuestionOptionB(String questionOptionB) {
		this.questionOptionB = questionOptionB;
	}
	public String getQuestionAnswer() {
		return questionAnswer;
	}
	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	@Override
	public String toString() {
		return "QuestionJavaLevel1 [questionId=" + questionId + ", questionDesc=" + questionDesc + ", questionOptionA="
				+ questionOptionA + ", questionOptionB=" + questionOptionB + ", questionAnswer=" + questionAnswer + "]";
	}
	public QuestionJavaLevel2(int questionId, String questionDesc, String questionOptionA, String questionOptionB,
			String questionAnswer) {
		super();
		this.questionId = questionId;
		this.questionDesc = questionDesc;
		this.questionOptionA = questionOptionA;
		this.questionOptionB = questionOptionB;
		this.questionAnswer = questionAnswer;
	}
	public QuestionJavaLevel2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

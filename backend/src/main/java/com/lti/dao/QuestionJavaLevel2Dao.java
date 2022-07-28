package com.lti.dao;

import java.util.List;

import com.lti.beans.QuestionJavaLevel2;

public interface QuestionJavaLevel2Dao extends QuestionDao{
	int addQuestion(QuestionJavaLevel2 qjl2);
	
	boolean updateQuestion(QuestionJavaLevel2 qjl2);
	
	boolean removeQuestion(int id);

	List<QuestionJavaLevel2> displayQuestion();
}

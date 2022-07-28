package com.lti.services;

import java.util.List;

import com.lti.beans.QuestionPythonLevel1;

public interface QuestionPythonLevel1Service extends QuestionService{
	int addQuestion(QuestionPythonLevel1 qjl1);
	
	boolean updateQuestion(QuestionPythonLevel1 qjl1);
	
	boolean removeQuestion(int id);

	List<QuestionPythonLevel1> displayQuestion();

}

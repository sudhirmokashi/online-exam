package com.lti.dao;

import java.util.List;

import com.lti.beans.QuestionPythonLevel1;

public interface QuestionPythonLevel1Dao extends QuestionDao{
	int addQuestion(QuestionPythonLevel1 qpl1);
	
	boolean updateQuestion(QuestionPythonLevel1 qpl1);
	
	boolean removeQuestion(int id);

	List<QuestionPythonLevel1> displayQuestion();
}

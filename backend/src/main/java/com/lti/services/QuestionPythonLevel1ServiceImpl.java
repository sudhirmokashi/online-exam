package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.QuestionPythonLevel1;
import com.lti.dao.QuestionPythonLevel1Dao;

@Service("questionPythonLevel1Service")
public class QuestionPythonLevel1ServiceImpl implements QuestionPythonLevel1Service{

	@Autowired
	QuestionPythonLevel1Dao qpl1dao;
	@Override
	public int addQuestion(QuestionPythonLevel1 qpl1) {
		System.out.println("Question Python: Service layer - addQuestion method");
		return(qpl1dao.addQuestion(qpl1));
	}

	@Override
	public boolean updateQuestion(QuestionPythonLevel1 qpl1) {
		System.out.println("Question Python Level 1: Service layer - updateQuestion method");
		return (qpl1dao.updateQuestion(qpl1));
	}

	@Override
	public boolean removeQuestion(int id) {
		System.out.println("Question Python Level 1: Service layer - removeQuestion method");
		return (qpl1dao.removeQuestion(id));
	}

	@Override
	public List<QuestionPythonLevel1> displayQuestion() {
		System.out.println("Question Python Level 1: Service layer - displayQuestion method");
		return qpl1dao.displayQuestion();
	}
	

}

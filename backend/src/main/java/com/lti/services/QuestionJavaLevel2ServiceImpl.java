package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.QuestionJavaLevel2;
import com.lti.dao.QuestionJavaLevel2Dao;

@Service("questionJavaLevel2Service")
public class QuestionJavaLevel2ServiceImpl implements QuestionJavaLevel2Service{

	@Autowired
	QuestionJavaLevel2Dao qjl2dao;
	@Override
	public int addQuestion(QuestionJavaLevel2 qjl2) {
		System.out.println("Question Java Level 2: Service layer - addQuestion method");
		return(qjl2dao.addQuestion(qjl2));
	}

	@Override
	public boolean updateQuestion(QuestionJavaLevel2 qjl2) {
		System.out.println("Question Java Level 2: Service layer - updateQuestion method");
		return (qjl2dao.updateQuestion(qjl2));
	}

	@Override
	public boolean removeQuestion(int id) {
		System.out.println("Question Java Level 2: Service layer - removeQuestion method");
		return (qjl2dao.removeQuestion(id));
	}

	@Override
	public List<QuestionJavaLevel2> displayQuestion() {
		System.out.println("Question Java Level 2: Service layer - displayQuestion method");
		return qjl2dao.displayQuestion();
	}
	

}

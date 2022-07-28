package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.QuestionPythonLevel1;

@Repository
public class QuestionPythonLeve1DaoImpl implements QuestionPythonLevel1Dao{

	@PersistenceContext
	private EntityManager em;
	@Override
	@Transactional
	public int addQuestion(QuestionPythonLevel1 qpl1) {
		System.out.println("Question Java Level 1: dao layer - addQuestion method");
		em.persist(qpl1);
		return qpl1.getQuestionId();
	}
	@Override
	@Transactional
	public boolean updateQuestion(QuestionPythonLevel1 qpl1) {
		System.out.println("Question Java Level 1: dao layer - updateQuestion method");
		try
		{
			em.merge(qpl1);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: " +e.getMessage());
			System.out.println("Execution Continues");
		}
		return true;
	}

	@Override
	@Transactional
	public boolean removeQuestion(int id) {
		System.out.println("Question Java Level 1: dao layer - removeQuestion method");
		QuestionPythonLevel1 qpl1 = em.find(QuestionPythonLevel1.class, id);
		try
		{
			em.remove(qpl1);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: " +e.getMessage());
			System.out.println("Execution Continues");
		}
		return true;
	}

	@Override
	public List<QuestionPythonLevel1> displayQuestion() {
		System.out.println("Question Java level 1: dao layer - displayQuestion method");
		TypedQuery<QuestionPythonLevel1> qry = em.createQuery("Select qpl1 from QuestionPythonLevel1 qpl1", QuestionPythonLevel1.class);
		List<QuestionPythonLevel1> qjList = qry.getResultList();
		System.out.println(qjList);
		return qjList;
	}

}

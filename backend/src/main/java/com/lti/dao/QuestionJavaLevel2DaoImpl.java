package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.QuestionJavaLevel2;

@Repository
public class QuestionJavaLevel2DaoImpl implements QuestionJavaLevel2Dao{

	@PersistenceContext
	private EntityManager em;
	@Override
	@Transactional
	public int addQuestion(QuestionJavaLevel2 qjl2) {
		System.out.println("Question Java Level 2: dao layer - addQuestion method");
		em.persist(qjl2);
		return qjl2.getQuestionId();
	}
	@Override
	@Transactional
	public boolean updateQuestion(QuestionJavaLevel2 qjl2) {
		System.out.println("Question Java Level 2: dao layer - updateQuestion method");
		try
		{
			em.merge(qjl2);
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
		System.out.println("Question Java Level 2: dao layer - removeQuestion method");
		QuestionJavaLevel2 qjl2 = em.find(QuestionJavaLevel2.class, id);
		try
		{
			em.remove(qjl2);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: " +e.getMessage());
			System.out.println("Execution Continues");
		}
		return true;
	}

	@Override
	public List<QuestionJavaLevel2> displayQuestion() {
		System.out.println("Question Java level 2: dao layer - displayQuestion method");
		TypedQuery<QuestionJavaLevel2> qry = em.createQuery("Select qjl2 from QuestionJavaLevel2 qjl2", QuestionJavaLevel2.class);
		List<QuestionJavaLevel2> qjList = qry.getResultList();
		System.out.println(qjList);
		return qjList;
	}

}

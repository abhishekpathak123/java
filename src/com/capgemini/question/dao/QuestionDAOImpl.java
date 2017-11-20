package com.capgemini.question.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.question.bean.Question;

@Repository
@Transactional
public class QuestionDAOImpl implements IQuestionDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Question addQuestion(Question question) {
		entityManager.persist(question);
		entityManager.flush();
		return question;
	}

}

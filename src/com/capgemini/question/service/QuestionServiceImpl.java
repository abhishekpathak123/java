package com.capgemini.question.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.question.bean.Question;
import com.capgemini.question.dao.IQuestionDAO;

@Service
public class QuestionServiceImpl implements IQuestionService {

	@Autowired
	IQuestionDAO questionDao;
		
	public IQuestionDAO getQuestionDao() {
		return questionDao;
	}


	public void setQuestionDao(IQuestionDAO questionDao) {
		this.questionDao = questionDao;
	}


	@Override
	public Question addQuestion(Question question) {
		// TODO Auto-generated method stub
		return questionDao.addQuestion(question);
	}

}

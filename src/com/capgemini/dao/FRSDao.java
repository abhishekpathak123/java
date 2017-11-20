package com.capgemini.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.bean.FRSBean;


@Repository
@Transactional
public class FRSDao implements IFRSDao {

	
	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public FRSBean addFlat(FRSBean frsbean) {
		// TODO Auto-generated method stub

		em.persist(frsbean);
		em.flush();
		
		return frsbean;
	}

}

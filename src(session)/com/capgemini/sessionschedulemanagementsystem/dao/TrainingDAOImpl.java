/**
 * 
 */
package com.capgemini.sessionschedulemanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.sessionschedulemanagementsystem.bean.ScheduledSession;

/**
 * @author Mayur Dongare
 *
 */

@Repository
@Transactional
public class TrainingDAOImpl implements ITrainingDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/*******************************************************************************************************
	 - Function Name	:	retrieveAllScheduledSession
	 - Input Parameters	:	-
	 - Return Type		:	List<ScheduledSession>
	 - Author			:	Mayur Dongare
	 - Creation Date	:	12/10/2017
	 - Description		:	This method is used to retrieving all scheduled sessions from database
	 						and return List of ScheduledSession.
	 ********************************************************************************************************/
	
	@Override
	public List<ScheduledSession> retrieveAllScheduledSession() {
		TypedQuery<ScheduledSession> typedQuery = entityManager
				.createQuery(
						"SELECT scheduledSession FROM ScheduledSession scheduledSession",
						ScheduledSession.class);
		return typedQuery.getResultList();
	}
	
	/*******************************************************************************************************
	 - Function Name	:	getScheduledSessionById
	 - Input Parameters	:	int id
	 - Return Type		:	ScheduledSession
	 - Author			:	Mayur Dongare
	 - Creation Date	:	12/10/2017
	 - Description		:	This method is used to retrieving scheduled session by id from database
	 						and return List of ScheduledSession.
	 ********************************************************************************************************/

	@Override
	public ScheduledSession getScheduledSessionById(int id) {
		return entityManager.find(ScheduledSession.class, id);
	}

}

/**
 * 
 */
package com.capgemini.sessionschedulemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.sessionschedulemanagementsystem.bean.ScheduledSession;
import com.capgemini.sessionschedulemanagementsystem.dao.ITrainingDAO;

/**
 * @author Mayur Dongare
 *
 */

@Service
public class TrainingServiceImpl implements ITrainingService {

	@Autowired
	private ITrainingDAO trainingDAO;

	public ITrainingDAO getTrainingDAO() {
		return trainingDAO;
	}

	public void setTrainingDAO(ITrainingDAO trainingDAO) {
		this.trainingDAO = trainingDAO;
	}


	/*******************************************************************************************************
	 - Function Name	:	retrieveAllScheduledSession
	 - Input Parameters	:	-
	 - Return Type		:	List<ScheduledSession>
	 - Author			:	Mayur Dongare
	 - Creation Date	:	12/10/2017
	 - Description		:	This method is used to retrieving all scheduled sessions from database 
	 						by calling retrieveAllScheduledSession method of TrainingDAO class 
	 						and return List of ScheduledSession.
	 ********************************************************************************************************/

	
	@Override
	public List<ScheduledSession> retrieveAllScheduledSession() {
		return trainingDAO.retrieveAllScheduledSession();
	}
	
	/*******************************************************************************************************
	 - Function Name	:	getScheduledSessionById
	 - Input Parameters	:	int id
	 - Return Type		:	ScheduledSession
	 - Author			:	Mayur Dongare
	 - Creation Date	:	12/10/2017
	 - Description		:	This method is used to retrieving scheduled session by id from database
	 						by calling getScheduledSessionById of TrainingDAO class
	 						and return List of ScheduledSession.
	 ********************************************************************************************************/


	@Override
	public ScheduledSession getScheduledSessionById(int id) {
		return trainingDAO.getScheduledSessionById(id);
	}

}

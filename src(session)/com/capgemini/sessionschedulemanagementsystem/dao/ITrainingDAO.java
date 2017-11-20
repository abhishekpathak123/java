/**
 * 
 */
package com.capgemini.sessionschedulemanagementsystem.dao;

import java.util.List;

import com.capgemini.sessionschedulemanagementsystem.bean.ScheduledSession;

/**
 * @author Mayur Dongare
 *
 */
public interface ITrainingDAO {

	public List<ScheduledSession> retrieveAllScheduledSession();
	
	public ScheduledSession getScheduledSessionById(int id);
}
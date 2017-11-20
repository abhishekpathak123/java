/**
 * 
 */
package com.capgemini.sessionschedulemanagementsystem.service;

import java.util.List;

import com.capgemini.sessionschedulemanagementsystem.bean.ScheduledSession;

/**
 * @author Mayur Dongare
 *
 */
public interface ITrainingService {
	public List<ScheduledSession> retrieveAllScheduledSession();

	public ScheduledSession getScheduledSessionById(int id);

}

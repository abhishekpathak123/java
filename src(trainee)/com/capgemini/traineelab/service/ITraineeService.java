/**
 * 
 */
package com.capgemini.traineelab.service;

import java.util.List;

import com.capgemini.traineelab.beans.Trainee;

/**
 * @author Mayur Dongare
 *
 */
public interface ITraineeService {
	public Trainee addTrainee(Trainee trainee);

	public void deleteTrainee(Trainee trainee);

	public Trainee modifyTrainee(Trainee trainee);

	public Trainee retrieveTrainee(int traineeId);

	public List<Trainee> retrieveAllTrainees();

}

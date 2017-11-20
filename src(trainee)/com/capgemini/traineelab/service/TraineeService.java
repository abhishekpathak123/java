/**
 * 
 */
package com.capgemini.traineelab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.traineelab.beans.Trainee;
import com.capgemini.traineelab.dao.ITraineeDao;

/**
 * @author Mayur Dongare
 *
 */

@Service
public class TraineeService implements ITraineeService {

	@Autowired
	private ITraineeDao traineeDao;

	public ITraineeDao getTraineeDao() {
		return traineeDao;
	}

	public void setTraineeDao(ITraineeDao traineeDao) {
		this.traineeDao = traineeDao;
	}

	@Override
	public Trainee addTrainee(Trainee trainee) {
		return traineeDao.addTrainee(trainee);
	}

	public void deleteTrainee(Trainee trainee) {
		traineeDao.deleteTrainee(trainee);
	}

	@Override
	public Trainee modifyTrainee(Trainee trainee) {
		return traineeDao.modifyTrainee(trainee);
	}

	@Override
	public Trainee retrieveTrainee(int traineeId) {
		return traineeDao.retrieveTrainee(traineeId);
	}

	@Override
	public List<Trainee> retrieveAllTrainees() {
		return traineeDao.retrieveAllTrainees();
	}

}
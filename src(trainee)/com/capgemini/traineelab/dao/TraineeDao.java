/**
 * 
 */
package com.capgemini.traineelab.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.traineelab.beans.Trainee;

/**
 * @author Mayur Dongare
 *
 */

@Repository
@Transactional
public class TraineeDao implements ITraineeDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Trainee addTrainee(Trainee trainee) {
		entityManager.persist(trainee);
		entityManager.flush();
		return trainee;
	}

	@Override
	public void deleteTrainee(Trainee trainee) {
		entityManager.remove(trainee);
	}

	@Override
	public Trainee modifyTrainee(Trainee trainee) {
		return entityManager.merge(trainee);
	}

	@Override
	public Trainee retrieveTrainee(int traineeId) {
		return entityManager.find(Trainee.class, traineeId);
	}

	@Override
	public List<Trainee> retrieveAllTrainees() {
		TypedQuery<Trainee> typedQuery = entityManager.createQuery(
				"SELECT trainee FROM Trainee trainee", Trainee.class);
		return typedQuery.getResultList();
	}

}

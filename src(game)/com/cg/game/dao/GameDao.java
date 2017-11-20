package com.cg.game.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.game.bean.Game;
import com.cg.game.bean.Users;

@Repository
@Transactional
public class GameDao implements IGameDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Game> gameList() {
		TypedQuery<Game> query = entityManager.createQuery(
				"SELECT g FROM Game g", Game.class);
		return query.getResultList();
	}

	@Override
	public Users getUser(int userId) {
		return entityManager.find(Users.class, userId);

	}

	@Override
	public int updateBalance(int userId, int balance) {
		Query query = entityManager
				.createQuery("Update Users u set u.userBalance=:uBal where u.userId=:uId");
		query.setParameter("uBal", balance);
		query.setParameter("uId", userId);
		int result = query.executeUpdate();
		return result;
	}

}

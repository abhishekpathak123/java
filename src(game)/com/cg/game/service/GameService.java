package com.cg.game.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.game.bean.Game;
import com.cg.game.bean.Users;
import com.cg.game.dao.IGameDao;

@Service
public class GameService implements IGameService {
	@Autowired
	IGameDao gameDao;

	public IGameDao getGameDao() {
		return gameDao;
	}

	public void setGameDao(IGameDao gameDao) {
		this.gameDao = gameDao;
	}

	@Override
	public List<Game> gameList() {
		return gameDao.gameList();
	}

	@Override
	public Users getUser(int userId) {
		return gameDao.getUser(userId);
	}

	@Override
	public int updateBalance(int userId,int balance) {
		// TODO Auto-generated method stub
		return gameDao.updateBalance(userId,balance);
	}

}

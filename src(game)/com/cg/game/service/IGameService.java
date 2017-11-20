package com.cg.game.service;

import java.util.List;

import com.cg.game.bean.Game;
import com.cg.game.bean.Users;

public interface IGameService {
	public List<Game> gameList();

	public Users getUser(int userId);

	public int updateBalance(int userId,int balance);
}

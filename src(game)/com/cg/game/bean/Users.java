package com.cg.game.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	@Id
	@Column(name = "user_Id")
	private int userId;
	@Column(name = "name")
	private String userName;
	@Column(name = "balance")
	private int userBalance;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserBalance() {
		return userBalance;
	}

	public void setUserBalance(int userBalance) {
		this.userBalance = userBalance;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName
				+ ", userBalance=" + userBalance + "]";
	}

}

package com.sample.di.demo5;

public class UserService {

	UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	PointDao pointDao;
	public void setPointDao(PointDao pointDao) {
		this.pointDao = pointDao;
	}
	
	void addNewUser(String name, String id, String password) {
		userDao.insertUser(name, id, password);
		pointDao.updatePoint(id, 10);
	}
}

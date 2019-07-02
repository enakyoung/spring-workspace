package com.sample.di.demo8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	private UserDao userDao;
	
	@Autowired		// setter메소드에 붙이면 매개변수에 해당하는 것을 찾ㅇㅁ
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}

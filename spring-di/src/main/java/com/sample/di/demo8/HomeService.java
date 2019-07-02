package com.sample.di.demo8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomeService {
	
	@Autowired				// userDao류가 두 개 이상일 경우 에러
	private UserDao userDao;
	
	@Autowired
	private ProductDao productDao;
}

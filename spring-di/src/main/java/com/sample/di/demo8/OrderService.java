package com.sample.di.demo8;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Resource
	private UserDao userDao;
	
	@Resource
	private ProductDao productDao;
	
	// @Autowired	--> 에러 : OrderDao류가 두 개 이상이라서
	// @Resource	--> 에러
	@Resource(name = "orderOracleDao")
	private OrderDao orderDao;
}

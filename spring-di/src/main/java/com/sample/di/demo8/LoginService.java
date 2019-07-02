package com.sample.di.demo8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component			// 빈 자동 등록
public class LoginService {
	@Autowired		// 생성된 bean중에서 @Autowired를 감지해서 변수타입을 확인 후 변수타입에 맞는 객체를 자동으로 붙여줌 - 빈 자동 묶기
	private UserDao userDao;
	
	public void login(String id, String pwd) {
		String dbPassword = userDao.getPasswordById(id);
		System.out.println("가입 시 비밀번호: " + dbPassword);
		
		if(pwd.equals(dbPassword)) {
			System.out.println("비밀번호가 일치합니다.");
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
	}
}

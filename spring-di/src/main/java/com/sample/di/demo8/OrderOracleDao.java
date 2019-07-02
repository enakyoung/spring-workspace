package com.sample.di.demo8;

import org.springframework.stereotype.Repository;

@Repository("orderOracleDao")	// bean 등록할 때 id 지정하듯이
public class OrderOracleDao implements OrderDao {

	public void removeOrder() {
		System.out.println("오라클 데이터베이스에서 주문정보를 삭제합니다.");
	}
}

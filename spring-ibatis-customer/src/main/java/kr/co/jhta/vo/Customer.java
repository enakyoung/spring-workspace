package kr.co.jhta.vo;

import java.util.Date;

public class Customer {

	private int custNo;
	private String custName;
	private String custFName;
	private String custPhone;
	private String custEmail;
	private String custAdd;
	private int custPoint;
	private Date custCreateDate;
	
	public Customer() {}

	public int getcustNo() {
		return custNo;
	}

	public void setcustNo(int custNo) {
		this.custNo = custNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustFName() {
		return custFName;
	}

	public void setCustFName(String custFName) {
		this.custFName = custFName;
	}

	public String getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCustAdd() {
		return custAdd;
	}

	public void setCustAdd(String custAdd) {
		this.custAdd = custAdd;
	}

	public int getCustPoint() {
		return custPoint;
	}

	public void setCustPoint(int custPoint) {
		this.custPoint = custPoint;
	}

	public Date getCustCreateDate() {
		return custCreateDate;
	}

	public void setCustCreateDate(Date custCreateDate) {
		this.custCreateDate = custCreateDate;
	}
}

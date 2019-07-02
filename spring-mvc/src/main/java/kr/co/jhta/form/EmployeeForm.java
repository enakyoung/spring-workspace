package kr.co.jhta.form;

public class EmployeeForm {

	// 입력폼의 name이랑 똑같이 변수명을 만듦
	private String id;
	private String name;
	private String dept;
	private String position;
	private int salary;
	private double commission;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	@Override
	public String toString() {
		return "EmployeeForm [id=" + id + ", name=" + name + ", dept=" + dept + ", position=" + position + ", salary="
				+ salary + ", commission=" + commission + "]";
	}
}

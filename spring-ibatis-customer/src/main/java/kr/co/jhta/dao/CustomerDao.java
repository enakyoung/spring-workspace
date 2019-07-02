package kr.co.jhta.dao;

import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import kr.co.jhta.vo.Customer;

public class CustomerDao {

	private SqlMapClientTemplate template;
	public void setTemplate(SqlMapClientTemplate template) {
		this.template = template;
	}
	
	@SuppressWarnings("unchecked")
	public List<Customer> getAllCustomer() {
		return template.queryForList("getAllCustomer");
	}
	
	public Customer getCustomerByNo(int custNo) {
		return (Customer) template.queryForObject("getCustomerByNo", custNo);
	} 
	
	@SuppressWarnings("unchecked")
	public List<Customer> getCustomerByKeyword(Map<String, Object> map) {
		return template.queryForList("getCustomerByKeyword", map);
	}
	
	public void updateCustomer(Customer customer) {
		template.update("updateCustomer", customer);
	} 
	
	public void deleteCustomer(int custNo) {
		template.delete("deleteCustomer", custNo);
	}
	
	public void addCustomer(Customer cust) {
		template.insert("addCustomer", cust);
	}
}

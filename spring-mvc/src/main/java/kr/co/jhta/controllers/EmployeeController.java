package kr.co.jhta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.jhta.dao.DepartmentDao;
import kr.co.jhta.dao.EmployeeDao;
import kr.co.jhta.vo.Department;
import kr.co.jhta.vo.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private DepartmentDao deptDao;
	@Autowired
	private EmployeeDao empDao;

	@RequestMapping("/depts.do")
	public String depts(Model model) {
		List<Department> depts = deptDao.getAllDept();
		model.addAttribute("depts", depts);
		
		return "emp/depts";
	}
	
	@RequestMapping("/employees.do")
	public String employees(Integer deptId, Model model) {
		List<Employee> employees = deptDao.getDeptEmp(deptId);
		model.addAttribute("employees", employees);
		
		return "emp/employees";
	}
	
	@RequestMapping("/employee.do")
	public String employee(Integer empId, Model model) {
		Employee employee = empDao.getEmployee(empId);
		model.addAttribute("employee", employee);
		
		return "emp/employee";
	}
}

package kr.co.jhta.app;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.dao.CustomerDao;
import kr.co.jhta.vo.Customer;

public class CustomerApp {

	public static void main(String[] args) {
		String resource = "classpath:/META-INF/spring/context.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);

		CustomerDao customerDao = ctx.getBean(CustomerDao.class);
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n");
			System.out.println("------------------------------------------------------");
			System.out.println("1.전체조회 2.검색 3.등록 4.수정 5.삭제 0.종료");
			System.out.println("------------------------------------------------------");
			
			System.out.print("메뉴선택> ");
			int menu = scanner.nextInt();
			
			if (menu == 1) {
				List<Customer> customer = customerDao.getAllCustomer();
				for(Customer cust : customer) {
					System.out.println("고객번호 : " + cust.getcustNo());
					System.out.println("고객이름 : " + cust.getCustName());
					System.out.println("고객번호 : " + cust.getCustPhone());
					System.out.println();
				}
				
			} else if (menu == 2) {
				System.out.print("검색할 고객번호 입력> ");
				int custNo = scanner.nextInt();
				
				Customer customer = customerDao.getCustomerByNo(custNo);
				
				if(customer != null) {
					System.out.println("번호: " + customer.getcustNo());
					System.out.println("이름: " + customer.getCustName());
					System.out.println("닉네임: " + customer.getCustFName());
					System.out.println("전화번호: " + customer.getCustPhone());
					System.out.println("이메일: " + customer.getCustEmail());
					System.out.println("포인트: " + customer.getCustPoint());
					System.out.println("등록일: " + customer.getCustCreateDate());
				} else {
					System.out.println("일치하는 회원이 없습니다.");
				}
				
			} else if (menu == 3) {
				System.out.print("이름: ");
				String custName = scanner.next();
				System.out.print("닉네임: ");
				String custFName = scanner.next();
				System.out.print("전화번호: ");
				String custPhone = scanner.next();
				System.out.print("이메일: ");
				String custEmail = scanner.next();
				System.out.print("거주지: ");
				String custAdd = scanner.next();
				System.out.print("포인트: ");
				int custPoint = scanner.nextInt();
				
				Customer customer = new Customer();
				customer.setCustName(custName);
				customer.setCustFName(custFName);
				customer.setCustPhone(custPhone);
				customer.setCustEmail(custEmail);
				customer.setCustAdd(custAdd);
				customer.setCustPoint(custPoint);
				
				customerDao.addCustomer(customer);
				
			} else if (menu == 4) {
				System.out.print("수정할 고객번호 입력> ");
				int custNo = scanner.nextInt();
				
				System.out.print("변경할 닉네임> ");
				String custFName = scanner.next();
				System.out.print("변경할 전화번호> ");
				String custPhone = scanner.next();
				System.out.print("변경할 이메일> ");
				String custEmail = scanner.next();
				System.out.print("변경할 거주지(서울, 경기, 인천)> ");
				String custAdd = scanner.next();
				System.out.print("변경할 포인트> ");
				int custPoint = scanner.nextInt();
				
				Customer customer = new Customer();
				customer.setcustNo(custNo);
				customer.setCustFName(custFName);
				customer.setCustPhone(custPhone);
				customer.setCustEmail(custEmail);
				customer.setCustAdd(custAdd);
				customer.setCustPoint(custPoint);
				
				customerDao.updateCustomer(customer);
				System.out.println("수정되었습니다.");
				
			} else if (menu == 5) {
				System.out.print("삭제할 고객번호 입력> ");
				int custNo = scanner.nextInt();
				
				customerDao.deleteCustomer(custNo);
				System.out.println("삭제되었습니다.");
				
			} else if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
		
	}
}

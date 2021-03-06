package kr.co.jhta.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	/*
	 *	"/home.do" url 요청이 오면 실행되는 요청 핸들러 메소드 정의
	 *		- "/home.do" url 요청이 접수되면 home()이 실행된다.
	 *		- home()이 반환하는 문자열이 이동할 jsp 페이지의 이름이다.
	 *		- spring mvc 프레임워크는 요청핸들러 메소드가 반환하는 문자열을
	 *			JSP이름으로 간주하고, 해당 JSP페이지로 요청을 이동시킨다.
	 *		- 요청을 받은 JSP의 실행결과로 생성된 HTML컨텐츠가 응답으로 제공된다.
	 */
	@RequestMapping(value="/home.do")
	public String home(Model model) {		// 전해줄 값이 있을 때 Model매개변수를 만들어서 전달
		model.addAttribute("message", "홈페이지가 새로 개편되었습니다.");
		
		List<String> rankings = Arrays.asList("에이치엘비", "박효신", "이엘",  "조은희", "사주논리여행");
		model.addAttribute("rankings", rankings);
		
		// 응답이 String인 경우 이동할 jsp페이지 이름
		return "main";
	}
	
	@RequestMapping("/about.do")	// value= 생략가능
	public String about() {
		return "about";
	}
}

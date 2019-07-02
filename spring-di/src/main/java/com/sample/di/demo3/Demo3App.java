package com.sample.di.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo3App {

	public static void main(String[] args) {
		String resource = "classpath:/com/sample/di/demo3/demo3.xml";
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);
		
		SampleController controller = ctx.getBean("controller", SampleController.class);
		
		controller.add("hong", "zxcv1234");
	}
}

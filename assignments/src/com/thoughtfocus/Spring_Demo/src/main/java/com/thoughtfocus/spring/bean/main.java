package com.thoughtfocus.spring.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main (String[]args) {
	//RefrigeratorBean bean = new RefrigeratorBean();
	//bean.maintainTeamperature();
		
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring-config.xml");
		RefrigeratorBean bean = container.getBean(RefrigeratorBean.class);
		//bean.maintainTeamperature();
		System.out.println(bean);
	}
	

}

package com.shsz.jpa.manage.dao.test;
/**
 * copyright (c) by shenzhou 2012
 */


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTxTestCase;

import com.shsz.jpa.manage.entity.Wyh1;
import com.shsz.jpa.manage.entity.Wyh2;
import com.shsz.jpa.manage.service.JPAJxetManageService;


 
public class AnswerServiceTest{
	
	 
	public JPAJxetManageService jpaJxetManageService;
	
	@Test
	public void TestSel() throws Exception {
		ApplicationContext appCt = new ClassPathXmlApplicationContext(
				"applicationContext-test.xml");
		Object bean = appCt.getBean("aa");
		jpaJxetManageService=(JPAJxetManageService)bean;
		Wyh1 w1 = new Wyh1();
		w1.setName("w1");
		Wyh2 w2 = new Wyh2();
			w2.setNames("w2");
		jpaJxetManageService.testJapSave(w1, w2);
	}
}

package com.shsz.jpa.manage.dao.test;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springside.modules.test.spring.SpringTxTestCase;

import com.shsz.jpa.manage.entity.Wyh1;
import com.shsz.jpa.manage.service.Wyh1Service;
@ContextConfiguration(locations = {"/applicationContext-test.xml"})
public class Wyh1DaoTest extends SpringTxTestCase{
	
	
	@Override
	@Autowired
	public void setDataSource(@Qualifier("masterDatasourceWyh") DataSource dataSource) {
		super.setDataSource(dataSource);
		this.dataSource = dataSource;
	}
	
	@Autowired
	private Wyh1Service wyh1Dao;
	@Test
	public void testSave(){
		Wyh1 w1 = new Wyh1();
		w1.setName("事务1测试");
		wyh1Dao.save(w1);
	}
}

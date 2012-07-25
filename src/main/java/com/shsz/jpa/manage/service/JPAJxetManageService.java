package com.shsz.jpa.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.shsz.jpa.manage.dao.Wyh1Dao;
import com.shsz.jpa.manage.dao.Wyh2Dao;
import com.shsz.jpa.manage.entity.Wyh1;
import com.shsz.jpa.manage.entity.Wyh2;

@Repository("aa")
public class JPAJxetManageService {
	
	@Autowired
	public Wyh1Dao wyh1Dao;
	@Autowired
	public Wyh2Dao wyh2Dao;
	
	/**
	 * 该为测试方法
	 * @param w1 第一个数据库中的表1
	 * @param w2 每二个数据库中的表2
	 * @throws Exception 
	 */
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,rollbackFor=Exception.class,value="jtaTransactionManager")
	public void testJapSave(Wyh1 w1,Wyh2 w2) throws Exception{
		wyh1Dao.save(w1);
		if(true){
			throw new Exception();
		}
		wyh2Dao.save(w2);
	}
	
}

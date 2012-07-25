package com.shsz.jpa.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.shsz.jpa.manage.dao.Wyh1Dao;
import com.shsz.jpa.manage.entity.Wyh1;

@Service
public class Wyh1Service {
	@Autowired
	public Wyh1Dao w;
	@Transactional(readOnly = false,propagation=Propagation.REQUIRED,rollbackFor=Exception.class,value="transactionManager")	
	public void save(Wyh1 w1){
		w.save(w1);
	}
}	

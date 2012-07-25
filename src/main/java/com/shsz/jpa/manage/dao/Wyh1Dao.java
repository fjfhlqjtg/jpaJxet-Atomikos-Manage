package com.shsz.jpa.manage.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springside.modules.orm.hibernate.HibernateDao;

import com.shsz.jpa.manage.entity.Wyh1;

@Repository
public class Wyh1Dao extends HibernateDao<Wyh1, Long> {
	
	@Override
	@Autowired
	public void setSessionFactory(@Qualifier("sessionFactoryWyh") SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	public void save(Wyh1 w1){
		super.save(w1);
	}
}

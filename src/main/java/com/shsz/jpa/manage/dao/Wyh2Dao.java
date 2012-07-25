package com.shsz.jpa.manage.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springside.modules.orm.hibernate.HibernateDao;

import com.shsz.jpa.manage.entity.Wyh2;

@Repository
public class Wyh2Dao extends  HibernateDao<Wyh2, Long> {
	@Override
	@Autowired
	public void setSessionFactory(@Qualifier("sessionFactoryWyh1") SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void save(Wyh2 w2){
		super.save(w2);
	}
}

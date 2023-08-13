package com.learning.orm.dao;

//import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
//import org.springframework.transaction.annotation.Transactional;

import com.learning.orm.entities.Student;



import jakarta.transaction.Transactional;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	
	@Transactional
	public int insert(Student student) {
		
		Integer i = (Integer) this.hibernateTemplate.save(student);
		
		return i;
		
	}

	public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public StudentDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	
	
	

}

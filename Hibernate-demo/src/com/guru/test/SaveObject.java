package com.guru.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.guru.domain.Employee;

public class SaveObject {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		//read both mapping,cfg files
		cfg=cfg.configure("/com/guru/cfgs/config.hbm.xml");
		//Build Session Factory
		SessionFactory factory=null;
		factory=cfg.buildSessionFactory();
		//Open Session with DB S/W
		Session session=factory.openSession();
		Transaction tx=null;
		Employee emp=new Employee();
		emp.setFname("Guru");
		emp.setFname("Konkimalla");
		emp.setEmail("konkimalla1253@gmail.com");
		try
		{
			tx=session.beginTransaction();
			session.save(emp);
			tx.commit();
			System.out.println("Object is saved successfully");
		}
		catch(Exception e)
		{
			tx.rollback();
		}
		session.close();
		factory.close();
		

	}

}

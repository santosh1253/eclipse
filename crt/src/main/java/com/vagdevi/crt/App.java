package com.vagdevi.crt;


import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class App {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("config.hbm.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Student s=new Student();
		s.setCollege("vagdevi");
		s.setName("Guru");
		Student s1=new Student();
		s1.setCollege("CMR");
		s1.setName("Ravi");
		Query query=session.createQuery("from Student");
		List list=query.list();
		System.out.println(list.toString());
		
		try {
//			Transaction t = session.beginTransaction();
//		    session.save(s);
//		    session.save(s1);
//			t.commit();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Try again");
		}

	}
}

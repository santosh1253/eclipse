package mydemo.hb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.guru.domain.Employee;

public class SaveObject {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		//read both mapping,cfg files
		cfg=cfg.configure("/config.hbm.xml");
		//Build Session Factory
		SessionFactory factory=null;
		factory=cfg.buildSessionFactory();
		//Open Session with DB S/W
		Session session=factory.openSession();
		Transaction tx=null;
		Employee emp=new Employee();
		emp.setEid(2);
		emp.setFname("Guru");
		emp.setLname("Konkimalla");
		emp.setEmail("guru@gmail.com");
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

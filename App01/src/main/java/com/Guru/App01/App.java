package com.Guru.App01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.Guru.entity.Employee;
import com.Guru.entity.Manager;

public class App 
{
    public static void main( String[] args )
    {
        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().
        		                    configure("config.hbm.xml").build();
        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory=meta.getSessionFactoryBuilder().build();
        Session ses=factory.openSession();
        Transaction tr=ses.beginTransaction();
        
        Employee emp=new Employee();
        emp.setName("Sai");
        emp.setSalary(60000.00f);
        
        Manager m=new Manager();
        m.setName("Guru");
        m.setSalary(75000.00f);
        
        emp.setManager(m);
        m.setEmployee(emp);        
        ses.save(m);
        tr.commit();
        
        ses.close();
        factory.close();
        System.out.println("success");
    }
}

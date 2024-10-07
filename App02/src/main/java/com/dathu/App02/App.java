package com.dathu.App02;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.dathu.entity.Employee;
import com.dathu.entity.Manager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder()
        		                        .configure("config.hbm.xml")
        		                        .build();
        Metadata meta=new MetadataSources(ssr)
        		          .getMetadataBuilder()
        		          .build();
        SessionFactory factory=meta.getSessionFactoryBuilder().build();
        Session ses=factory.openSession();
        Transaction tr=ses.beginTransaction();
        
        Employee e1=new Employee();
        e1.setName("Ravi");
        e1.setSalary(50000.00f);
        
        Employee e2=new Employee();
        e2.setName("Guru");
        e2.setSalary(75000.00f);
        
        Employee e3=new Employee();
        e3.setName("sai");
        e3.setSalary(70000.00f);
        
        List<Employee> list=new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        
        Manager m=new Manager();
        m.setName("sandeep");
        m.setEmployees(list);
        
        ses.save(m);
        
        tr.commit();
        ses.close();
        factory.close();
        System.out.println("success");
    }
}

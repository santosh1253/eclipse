package mydemo.hb;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import mydemo.hb.entity.Mobile;
import mydemo.hb.entity.User;

public class OneToManyApp {
	// cascade=casacadeType.ALL/REMOVE/DETACH/PERSIST if there is a persistent
	// operation
	// i.e if there is any change in parent obj there should be change in child obj
	// fetch type= fetchType.LAZY or EAGER eager means associated child objects are
	// also fetched and lazy means the objects are fetched on demand
	// JoinColumn(name="coulmnNameInChild" referencedColumnName="prim_keyInParent");

	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("myconfig.hbm.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session ses = factory.openSession();
		Transaction tr =null;
		User u = new User();
		u.setUserId(103);
		u.setFullName("santosh");
		u.setAddress("Hyderabad");
		Mobile m1 = new Mobile();
		m1.setNumber(9100785791L);
		m1.setNumberType("Personal");
		m1.setProvider("Airtel");
		Mobile m2 = new Mobile();
		m2.setNumber(7904360345L);
		m2.setNumberType("Office");
		m2.setProvider("Jio");
		Set<Mobile> s = new HashSet<Mobile>();
		s.add(m1);
		s.add(m2);
		u.setMobiles(s);
		System.out.println(u);
		//Example for OneToMany mapping
		//User [userId=103, fullName=santosh, address=Hyderabad
		//,mobiles=[Mobile [number=9100785791, numberType=Personal, provider=Airtel], Mobile [number=7904360345, numberType=Office, provider=Jio]]]
        try
        {
            tr = ses.beginTransaction();
            ses.save(u);
            tr.commit();
            System.out.println("user object saved successfully");
            
        }
        catch(Exception e)
        {
        	tr.rollback();
        	System.out.println("Not saved try again");
        	
        }
	}
}

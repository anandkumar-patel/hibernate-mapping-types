package anand.learn.one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;  

/**
 * store data.
 *
 */
public class StoreData 
{
    public static void main( String[] args) {

    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		final Session session = factory.openSession();

		Transaction t = session.beginTransaction();

		Employee e1=new Employee();    
	    e1.setName("Anand Patel");    
	    e1.setEmail("anand@gmail.com");    
	        
	    Address address1=new Address();    
	    address1.setAddressLine1("#331/9E, 6 Kempamma Layout, Hulimavu");    
	    address1.setCity("Bangalore");    
	    address1.setState("Karnataka");    
	    address1.setCountry("India");    
	    address1.setPincode(560076);    
	        
	    e1.setAddress(address1);    
	    address1.setEmployee(e1);    
	        
	    session.persist(e1);
	        
	    t.commit();    
	    session.close();    
	    factory.close();
	    System.out.println("success");    
	}
}

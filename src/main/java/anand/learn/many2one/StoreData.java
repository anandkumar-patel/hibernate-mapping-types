package anand.learn.many2one;

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
	    e1.setEmail("anand@practo.com");    
	    
	    Employee e2=new Employee();    
	    e2.setName("Krishna Sameer");    
	    e2.setEmail("krishna@practo.com");  
	        
	    Address officeAddress=new Address();    
	    officeAddress.setAddressLine1("Salarpuria Symbosis, Practo Technologies, Arekere");    
	    officeAddress.setCity("Bangalore");    
	    officeAddress.setState("Karnataka");    
	    officeAddress.setCountry("India");    
	    officeAddress.setPincode(560076);    
	        
	    e1.setAddress(officeAddress);
	    e2.setAddress(officeAddress);
	    //officeAddress.setEmployee(e1);    
	        
	    session.persist(e1);
	    session.persist(e2);
	    t.commit();    
	    session.close();    
	    factory.close();
	    System.out.println("success");    
	}
}

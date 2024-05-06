package Student.Association;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EmbeddableDemo {
	
	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").
		buildSessionFactory();
			
			Session session=factory.openSession();

			Transaction tx=session.beginTransaction();
			
			Address address1 = new Address("MP nagar","Bhopal", "MP" ,"1001");
			
			Employee emp1=new Employee("E111", "sandhya", 80000, address1);
			
			session.save(emp1);
			tx.commit();
			
			session.close();
			factory.close();

			}


}

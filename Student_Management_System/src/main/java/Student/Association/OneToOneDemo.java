package Student.Association;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class OneToOneDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Address address1 = new Address("MP nagar","Bhopal", "MP" ,"1001");
		Address address2 = new Address("Saket nagar","Bhopal", "MP" ,"1002");

		Employee emp1 = new Employee();
		emp1.setEmpId("E111");
		emp1.setEmpName("Sandhya");
		emp1.setSalary(80000);
		
		Employee emp2 = new Employee();
		emp2.setEmpId("E112");
		emp2.setEmpName("Vinita");
		emp2.setSalary(90000);
		
		emp1.setAddress(address1);
		emp2.setAddress(address2);
		
		session.save(emp1);
		session.save(emp2);
		
		session.save(address1);
		session.save(address2);
		
		tx.commit();
		session.close();
		factory.close();
	}

}

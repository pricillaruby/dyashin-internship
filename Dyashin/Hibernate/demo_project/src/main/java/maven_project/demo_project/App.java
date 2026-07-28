package maven_project.demo_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       //Step 1: Create SessionFactory
       //SessionFactory is a heavy weight object that is created once per application
       //It reads the configuration file(hibernate.cfg.xml) and knows how to connect to the DB
     	SessionFactory factory = new Configuration()
    			.configure("hibernate.cfg.xml")   //Load hibernate configuration
    			.addAnnotatedClass(Student.class) //Register our Entity class
    			.buildSessionFactory();
    	
    	//Step2: Open a Session
     	//A Session represents a connection(unit of work) between java and the database
     	Session session = factory.openSession();
     	try {
     		//Step 3: Begin a Transaction
     		session.beginTransaction();
     		
     		//Step 4: Create new Student Objects(Transient state - not yet saved in DB)
     		Student s1 = new Student("Pricilla","Java");
     		Student s2 = new Student("Jinu","Spingboot");
     		
     		//Step 5: Save the student objects to the database
     		session.persist(s1);
     		session.persist(s2);
     		
     		//Step 6: Commit the transaction
     		session.getTransaction().commit();
     		
     		//Step 7: Print Success message
     		System.out.println("Student Info Saved!");
     	}finally {
     		
     		//Step 8: Close the Session Factory (cleanup)
     		factory.close();
     	}
    }
}

package controller;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;

import module.retrieveQuestionData;

public class CollectQuestionData {
	
	Configuration cf = new Configuration();
	cf.configure("resources\\config\\hibernate.cfg.xml");

    SessionFactory factory = cf.buildSessionFactory();
    Session session = factory.openSession();
    
	String hql = "FROM retrieveQuestionData";
	Query query = session.createQuery(hql);
	List results = query.list();
    
    Object o=session.load(retrieveQuestionData.class,new Integer(101));
  
	retrieveQuestionData q = (retrieveQuestionData) o;
    // For loading Transaction scope is not necessary...
    System.out.println("Loaded object product name is___");
    System.out.println("Object Loaded successfully.....!!");
    
    session.close();
    factory.close();
    


}

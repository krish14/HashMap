package controller;

import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

import module.retrieveQuestionData;

public class CollectQuestionData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("config//hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		String sql = "select question_id, ifnull(answer_type,'0') as answer_type, ifnull(question_state,'0') as question_state, question_text, ifnull(numeric_min,'0') as numeric_min, ifnull(numeric_max,'0') as numeric_max, nickname from questions q";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(retrieveQuestionData.class);
		List results = query.list();

		Iterator i = results.iterator();
				while(i.hasNext()){
					Object a = i.next();
						retrieveQuestionData q = (retrieveQuestionData) a;
						System.out.println(q.getQuestion_text());

				}



		session.close();
		factory.close();


	}

}

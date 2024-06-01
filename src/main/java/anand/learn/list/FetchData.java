package anand.learn.list;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
		final Session session = factory.openSession();

		List<Question> list =session.createQuery("from Question").list();

		Iterator<Question> itr = list.iterator();
		while (itr.hasNext()) {
			Question q = itr.next();
			System.out.println("Question Name: " + q.getQuestName());

			// printing answers
			List<String> list2 = q.getAnswers();
			Iterator<String> itr2 = list2.iterator();
			while (itr2.hasNext()) {
				System.out.println(itr2.next());
			}
		}
		session.close();
		factory.close();
		System.out.println("success");
	}

}

package org.course.db.domain;

import java.util.List;

import org.course.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class DomainTest {

	public static void main(String[] args) throws Exception {
		Session session = HibernateUtil.buildSessionFactory().openSession();

		Criterion crit = Restrictions.eq("course", "304");
		Criteria criteria = session.createCriteria(Course.class);
		criteria.add(crit);
		@SuppressWarnings("rawtypes")
		List results = criteria.list();

		for (int i = 0; i < results.size(); i++) {
			System.out.println(((Course)results.get(i)).getTitle());
		}

	}

}

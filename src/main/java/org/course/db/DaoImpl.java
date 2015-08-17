package org.course.db;

import java.util.List;

import org.course.db.domain.Course;
import org.course.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements Dao {
	
	Session session;
	Transaction tx;
	
	public DaoImpl() {}
	
	@SuppressWarnings("unchecked")
	public List<Course> accessAllCourses() {
		session = HibernateUtil.buildSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Course.class);
		List<Course> results = criteria.list();
		return results;
	}
	
	@SuppressWarnings("unchecked")
	public List<Course> accessEnrolledCourses() {
		Criterion crit = Restrictions.eq("course", "304");
		Criteria criteria = session.createCriteria(Course.class);
		criteria.add(crit);
		List<Course> results = criteria.list();
		return results;
	}
	
	public Boolean saveOrUpdateCourse(Course course) {
		session = HibernateUtil.buildSessionFactory().openSession();
		tx = session.beginTransaction();
		session.saveOrUpdate(course);
		tx.commit();
		session.close();
		return !session.isOpen() && tx.wasCommitted();
	}
	
	
}

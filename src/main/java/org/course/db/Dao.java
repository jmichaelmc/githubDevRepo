package org.course.db;

import java.util.List;

import org.course.db.domain.Course;

public interface Dao {
	
	public List<Course> accessAllCourses();
	public List<Course> accessEnrolledCourses();
	public Boolean saveOrUpdateCourse(Course course);

}

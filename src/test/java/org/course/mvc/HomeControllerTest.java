package org.course.mvc;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.List;

import org.course.db.DaoImpl;
import org.course.db.domain.Course;
import org.junit.Test;

public class HomeControllerTest {
	
	@Test
	public void shouldDisplayCourses() {
		List<Course> expectedCourses = 
				asList(new Course(), new Course());
		
		DaoImpl dao = mock(DaoImpl.class);
		
		when(dao.accessAllCourses()).thenReturn(expectedCourses);
		
		HomeController controller = new HomeController(dao);
		
		HashMap<String, Object> model = new HashMap<String, Object>();
		String viewName = controller.initModel(model);
		
		assertEquals("home", viewName);
		
		assertSame(expectedCourses, model.get("courses"));
		
	}

}

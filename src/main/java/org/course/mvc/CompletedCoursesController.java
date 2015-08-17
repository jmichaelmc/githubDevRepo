package org.course.mvc;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.course.db.DaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({ "/completed-courses" })
public class CompletedCoursesController {

	@Autowired
	private DaoImpl dao;

	public CompletedCoursesController() {
	}

	public CompletedCoursesController(DaoImpl dao) {
		this.dao = dao;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String initModel(Map<String, Object> model, HttpServletRequest request) {
		model.put("courses", dao.accessAllCourses());
		
		return "completed-courses";
	}

}

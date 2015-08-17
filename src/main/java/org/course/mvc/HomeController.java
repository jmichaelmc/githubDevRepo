package org.course.mvc;

import java.util.Map;

import org.course.db.DaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({ "/", "/home" })
public class HomeController {

	@Autowired
	private DaoImpl dao;
	
	public HomeController() {
	}

	public HomeController(DaoImpl dao) {
		this.dao = dao;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String initModel(Map<String, Object> model) {
		model.put("courses", dao.accessAllCourses());
		return "home";
	}

}

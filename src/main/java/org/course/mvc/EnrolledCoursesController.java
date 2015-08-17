package org.course.mvc;

import java.util.ArrayList;
import java.util.List;

import org.course.db.DaoImpl;
import org.course.db.domain.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({ "/enrolled-courses" })
public class EnrolledCoursesController {

	@Autowired
	private DaoImpl dao;

	public EnrolledCoursesController() {
	}

	public EnrolledCoursesController(DaoImpl dao) {
		this.dao = dao;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String initModel(Model model) {
		Course course = new Course();
		model.addAttribute("course", course);
		initModelList(model);
		return "enrolled-courses";
	}

	private void initModelList(Model model) {
		List<String> courseList = new ArrayList<String>();
		for (Course c : dao.accessAllCourses()) {
			if (c.getTitle() != null) {
				courseList.add(c.getTitle());
			}
		}
		model.addAttribute("courses", courseList);
	}

}

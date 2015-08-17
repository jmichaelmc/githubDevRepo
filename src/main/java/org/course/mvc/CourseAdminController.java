package org.course.mvc;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.course.db.DaoImpl;
import org.course.db.domain.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({ "/course-admin" })
public class CourseAdminController {

	@Autowired
	private DaoImpl dao;

	public CourseAdminController() {
	}

	public CourseAdminController(DaoImpl dao) {
		this.dao = dao;
	}

	@ModelAttribute("course")
	public Course createModel() {
		return new Course();
	}

	@RequestMapping(method = RequestMethod.GET)
	public String initModel(Map<String, Object> model,
			HttpServletRequest request) {
		model.put("courses", dao.accessAllCourses());
		return "course-admin";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String saveOrUpdateCourse(HttpServletRequest request, Model model,
			@Valid Course course, BindingResult result) {
		if (result.hasErrors()) {
			return "course-admin";
		} else {
			course.setCrn(Integer.parseInt(request.getParameter("crn")));
			course.setSubject(request.getParameter("subject"));
			course.setCourse(request.getParameter("course"));
			course.setSection(request.getParameter("section"));
			course.setCredits(Integer.parseInt(request.getParameter("credits")));
			course.setTitle(request.getParameter("title"));
			course.setInstructor(request.getParameter("instructor"));
			System.out.println(course.getTitle());
			dao.saveOrUpdateCourse(course);
			return "course-admin";
		}
	}

}

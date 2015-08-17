package org.course.db.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Service;

@Entity
@Table(name = "COURSE")
@Service
public class Course {
	
	public Course() {}
	
	@Id
	@Column(name = "CRN")
	@Min(10000) @Max(99999)
	private Integer crn;
	
	@Column(name = "SUBJECT")
	@NotBlank(message = "{course.subject.NotBlank}")
	@Size(min = 2, max = 3)
	private String subject;
	
	@Column(name = "COURSE")
	@NotBlank(message = "{course.course.NotBlank}")
	@Size(min = 2, max = 3)
	private String course;
	
	@Column(name = "SECTION")
	@NotBlank(message = "{course.section.NotBlank}")
	@Size(min = 2, max = 3)
	private String section;
	
	@Column(name = "CREDITS")
	@Min(1) @Max(9)
	private Integer credits;
	
	@Column(name = "TITLE")
	@NotBlank(message = "{course.title.NotBlank}")
	private String title;
	
	@Column(name = "INSTRUCTOR")
	@NotBlank(message = "{course.instructor.NotBlank}")
	private String instructor;
	
	public Integer getCrn() {
		return crn;
	}
	public void setCrn(Integer crn) {
		this.crn = crn;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Integer getCredits() {
		return credits;
	}
	public void setCredits(Integer credits) {
		this.credits = credits;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	

}

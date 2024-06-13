package com.webprojects.springboot.spring_boot_projects;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// create a simple ResT API
// return course details with id, name, author



@RestController
public class CourseController {
	
	// list of courses
	// match url to api-endpoint using @RequestMapping
	@RequestMapping("/courses")
	public List<Course> retriveAllCourses(){
		return Arrays.asList(
				new Course(1, "Learn Java", "Online"), // object
				new Course(2, "Learn Spring Boot", "in28minutes"),
				new Course(3, "Learn AWS", "PrimeTalentUK"),
				new Course(4, "learn NodeJS", "Springboard")
			);
	}

}

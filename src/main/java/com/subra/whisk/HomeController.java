package com.subra.whisk;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.subra.whisk.model.Course;
import com.subra.whisk.model.Student;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/getstudent/{id}{name}", method=RequestMethod.GET, produces={"application/json", "application/xml"})
	public Student getStudent(HttpServletRequest request, HttpServletResponse response, @PathVariable ("id") int id, @PathVariable("name") String name){
		
		  // Create a new student object and return it
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
        Student student = new Student(id, name, dateFormatter.format(new Date()));
        
        List<Course> cources = student.getCourses();
        cources.add(new Course("Math", 15));
        cources.add(new Course("Politics", 100));
        
        return student;

	}
	

	@ResponseBody
	@RequestMapping(value = "echostudent", method=RequestMethod.POST, consumes = {"application/json", "application/xml"}, produces={"application/json", "application/xml"})
	public Student echoStudent(@RequestBody Student student, HttpServletRequest request, HttpServletResponse response){
		return student;
	}
	
}

package com.subra.whisk.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class Course implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String courseName;
    private Integer score;
    
	public Course() {}

	 public Course(String courseName, Integer score) {
	        this.courseName = courseName;
	        this.score = score;
	    }
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", score=" + score + "]";
	}

	

	
}

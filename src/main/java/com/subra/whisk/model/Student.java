package com.subra.whisk.model;

import java.io.Serializable;
import java.util.ArrayList;


	public class Student implements Serializable {
	    private static final long serialVersionUID = 1L;
	    
	    private int id;
	    private String name;
	    private String graduationTime;
	    private ArrayList<Course> courses = new ArrayList<Course>();

	
	    public Student(int id, String name, String graduationTime) {
	        this.id = id;
	        this.name = name;
	        this.graduationTime = graduationTime;
	    }

		public Student() {}

	
	    
	public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getGraduationTime() {
			return graduationTime;
		}



		public void setGraduationTime(String graduationTime) {
			this.graduationTime = graduationTime;
		}



		public ArrayList<Course> getCourses() {
			return courses;
		}



		public void setCourses(ArrayList<Course> courses) {
			this.courses = courses;
		}



		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", graduationTime="
					+ graduationTime + ", courses=" + courses + "]";
		}


	
	
	

}

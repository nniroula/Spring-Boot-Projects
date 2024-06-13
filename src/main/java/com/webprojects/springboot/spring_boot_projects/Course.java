package com.webprojects.springboot.spring_boot_projects;

public class Course {
	private long id;
	private String name;
	private String author;
	
	// constructor
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
 
	// getters
	public long getId() {
		return this.id;
	}
 
	public String getName() {
		return this.name;
	}
	
	public String getAuthor() {
		return this.author;
	}
 
 
 
	 // toString method
	 //@Override
	 public String toString() {
		 return "Course [id=" + id + ", name= " + name + ", author= " + author + "]"; 
		 }
}

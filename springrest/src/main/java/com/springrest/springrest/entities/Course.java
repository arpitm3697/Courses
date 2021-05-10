package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	private long id;
	private String title;
	private String description;
	private long price;
	public Course(long id, String title, String description, long price) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", description=" + description + ", price=" + price + "]";
	}
	
	

}

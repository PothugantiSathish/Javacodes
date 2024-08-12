package com.food.relation.ex;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Condidate {
	
	@Id
	private int id;
	private String name;
	
	@OneToMany(mappedBy = "condidate") //one candidate enrolled by many candiadets
	private List<Course>courses;

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

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Condidate [id=" + id + ", name=" + name + ", courses=" + courses + "]";
	}
	

}

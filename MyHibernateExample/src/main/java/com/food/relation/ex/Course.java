package com.food.relation.ex;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {
	
	@Id
	private int id;
	private String name;
	
	@ManyToOne
	private Condidate condidate;
	
	
	public Condidate getCondidate() {
		return condidate;
	}
	public void setCondidate(Condidate condidate) {
		this.condidate = condidate;
	}
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
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}
	
	

}

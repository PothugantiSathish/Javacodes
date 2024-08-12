package com.relation.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="studRelations")
public class StudentDto {
     
	@Id
	private int id ;
	private String name;
	@OneToOne  //it generates a foregn key to connection b/w two tables
	private Laptop laptop;
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
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", laptop=" + laptop + "]";
	}
	
	
}

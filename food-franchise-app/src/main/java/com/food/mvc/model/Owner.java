package com.food.mvc.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Owner {
	 
	@Id
	private int id;
	private String name;
	private String email;
	private String password;
	
	@OneToMany(mappedBy = "owner")
	private List<Worker> worker;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Worker> getWorker() {
		return worker;
	}

	public void setWorker(List<Worker> worker) {
		this.worker = worker;
	}

	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	

}

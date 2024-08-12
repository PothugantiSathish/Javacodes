package com.relation.hibernate;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class User_acc {
	 @Id
	 private int id;
	 private String name;
	 
	 @ManyToMany(mappedBy = "users")
	 private List<Bank> bank;
	 
	public List<Bank> getBank() {
		return bank;
	}
	public void setBank(List<Bank> bank) {
		this.bank = bank; 	
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
		return "User_acc [id=" + id + ", name=" + name + ", bank=" + bank + "]";
	}
	 
	
	

}

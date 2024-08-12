package com.relation.hibernate;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Bank {
	
	@Id
	private int id;
	private String bankName;
	
	@ManyToMany
	private List<User_acc> users;
	
	public List<User_acc> getUsers() {
		return users;
	}
	public void setUsers(List<User_acc> users) {
		this.users = users;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", bankName=" + bankName + ", users=" + users + "]";
	}
	

}

package com.uno;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="lazyrowdy")
public class Lazyguy {
	@Column(name="lazy_id")
	@Id
	private int id;
	@Column(name="lazy_name")
	private String name;
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
		return "ModalClass [id=" + id + ", name=" + name + "]";
	}
	
	
	
	

}

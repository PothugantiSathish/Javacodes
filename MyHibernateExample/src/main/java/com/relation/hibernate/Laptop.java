package com.relation.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity //Independent table
public class Laptop {
	
	@Id
	private int lap_id;
	private String lap_name;
	public int getLap_id() {
		return lap_id;
	}
	public void setLap_id(int lap_id) {
		this.lap_id = lap_id;
	}
	public String getLap_name() {
		return lap_name;
	}
	public void setLap_name(String lap_name) {
		this.lap_name = lap_name;
	}
	@Override
	public String toString() {
		return "Laptop [lap_id=" + lap_id + ", lap_name=" + lap_name + "]";
	}
	
	

}

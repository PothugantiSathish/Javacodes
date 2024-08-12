package com.food.relation.ex;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FoodOrder {
	
	@Id
	private int id;
	private String orderType;
	private int numOfItems;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public int getNumOfItems() {
		return numOfItems;
	}
	public void setNumOfItems(int numOfItems) {
		this.numOfItems = numOfItems;
	}
	@Override
	public String toString() {
		return "FoodOrder [id=" + id + ", orderType=" + orderType + ", numOfItems=" + numOfItems + "]";
	}
	
	

}

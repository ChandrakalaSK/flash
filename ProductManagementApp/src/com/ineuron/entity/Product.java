package com.ineuron.entity;

import java.io.Serializable;

public class Product implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String type;
	private String place;
	private int warranty;
	
	public Product(String name, String type, String place, int warranty) {
		super();
		this.name = name;
		this.type = type;
		this.place = place;
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", type=" + type + ", place=" + place + ", warranty=" + warranty + "]";
	}
	
	

}

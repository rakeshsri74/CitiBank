package com.rps.model;


public class Product {
	
	private String id;
	private String name;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}

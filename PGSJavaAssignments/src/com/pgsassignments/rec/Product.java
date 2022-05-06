package com.pgsassignments.rec;

import java.util.Comparator;

public class Product implements LongDescription{
	
	private int productId;
	private String description;
	private float price;
	private int units;
	
	public Product(int productId, String description, float price, int units) {
		super();
		this.productId = productId;
		this.description = description;
		this.price = price;
		this.units = units;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", description=" + description + ", price=" + price + ", units="
				+ units + "]";
	}

	@Override
	public String getLongDescription() {		
		return "Product ID: " + this.getProductId()
				+"\nDescription: " + this.getDescription()
				+"\nPrice: " + this.getPrice()
				+"\nUnits: " + this.getUnits()
				;
	}

	



	
	
}

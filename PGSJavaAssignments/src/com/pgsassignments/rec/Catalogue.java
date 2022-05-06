package com.pgsassignments.rec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Catalogue{
	
	List<Product> productList = new ArrayList<Product>();
	
	public Catalogue() {
		//super();
	}

	public boolean addProduct(Product product) {
		if(product instanceof Product) {
			productList.add(product);
			return true;
		}
		else {	return false; }	
	}
	
	public Object searchProduct(int productId) {		
		for (Product product : productList) {
			if(product.getProductId() == productId)
				return product;
			else
				return "No product with id: " + productId + " found";
		}
		
		return null;
	}
	
	public List<Product> listAll(){
		return productList;
	}
	
	public List<Product> sort() {
		Collections.sort(productList, new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				if(p1.getProductId() > p2.getProductId()) return 1;
				else if (p1.getProductId() < p2.getProductId()) return -1;
				else if (p1.getProductId() == p2.getProductId()) return 0;
				else return 0;
			}
		});
		return productList;
	}
	
	public boolean deleteProduct(int productId) {
		Iterator<Product> it  = productList.iterator();
		while(it.hasNext())
		{
			Product product = it.next();
			if(product.getProductId() == productId) productList.remove(product);
			return true;
		}
		return false;
	}
	

}

package com.pgsassignments.rec;

public class UseProduct {
	
	public static void main(String[] args) {

	float maxPrice;
	int maxPriceProductId = 0;
	
	Product p1 = new Product(100, "This is product 1", 125.5f, 200);
	Product p2 = new Product(101, "This is product 2", 115.5f, 210);
	Product p3 = new Product(102, "This is product 3", 100.0f, 100);
	Product p4 = new Product(103, "This is product 4", 1125.5f, 200);
	Product p5 = new Product(104, "This is product 5", 1225.5f, 400);
	
	Product[] pdtArray = {p1, p2, p3, p4, p5};
	
	maxPrice = p1.getPrice();
	
	for(int i = 0 ; i < 5; i++) {
		if(pdtArray[i].getPrice() > maxPrice)
			maxPrice = pdtArray[i].getPrice();
			maxPriceProductId = i;
	}
	
	System.out.println("Details of product with maximum price: ");
	System.out.println(pdtArray[maxPriceProductId].toString());
		
	}	

}

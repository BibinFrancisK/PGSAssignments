//Q31

package com.pgsassignments.rec;

import java.util.ArrayList;

public class CircleEx {

		
		private double radius;

		public CircleEx(double radius) {
			//super();
			this.radius = radius;
		}

		public double getRadius() {
			return radius;
		}

		public void setRadius(int radius) {
			this.radius = radius;
		}
	
	
	public static void main(String[] args) {
		ArrayList<CircleEx> circleList = new ArrayList<CircleEx>();
		double r;
		System.out.println("Generating circles_______");
		while(Math.random() >= 0.01) {
			r = Math.random();
			circleList.add(new CircleEx(r));
			System.out.println("Circle generated with radius: " + r);
		}
		
	}

}

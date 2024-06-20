package com.rays.polymorphism;

public class Circle extends Shape {
	
	private int radius ;
	
	
	//Default constructor 
	public  Circle () {
	
	}
	
	//By constructor
	public Circle (int radius) {
		
		this.radius = radius ;
	}
	
	//By getter && setter
	
	public int getradius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this .radius = radius;
		
	}
	
	@Override
	public double area() {
	  double area = PI * Math.pow(radius,2);
	  
	  System.out.println( "Area of the circle = " + area);
	  
	  return area;
	}
	
	
	
	

}
	



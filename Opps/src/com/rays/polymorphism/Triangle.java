package com.rays.polymorphism;

public class Triangle extends Shape {
	
	private int base ;
	private int height;
	
	
	//By Constructor
	public Triangle() {
		
	}
	
	//Create Constructor
	public Triangle (int base ,int height) {
		this.base = base ;
		this.height = height ;
	}
	
	//By setter && getter 

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public double area() {
		double area = base * height /2;
		
		System.out.println("area of the triangle = "+ area);
		
		return area;
	}
	
	
     
	

}

package com.rays.polymorphism;

public class Rectangle extends Shape {
	private int l;
	private int b;

	public Rectangle() {

	}

	// By constructor
	public Rectangle(int l, int b) {

		this.l = l;
		this.b = b;

	}

	// By setter && getter

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	@Override
	public double area() {
		double area = l * b ;
		
		System.out.println("area of the rectangle ="+ area);
		
		return area ;
	}

}

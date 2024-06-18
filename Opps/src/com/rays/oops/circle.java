package com.rays.oops;

public class circle extends Shape {
	
	private int radius;
	
	public int getRadius() {
		return radius ;
	}
	
	public void setRadius (int radius) {
		this.radius = radius;
		
	}
	
	public double area () {
		double area = 3.14 * radius * radius ;
		
		return area; 
	}
	
	public static void main(String[] args) {
		
		circle c = new circle ();
		
		c.setRadius(4);
		c.setColor("blue");
		c.setBorderWidth(5);
		
		System.out.println("radius = "+ c.getRadius());
		System.out.println("Color = "+ c.getColor());
		System.out.println("Width = " + c.getBorderWidth());
		
		double a = c.area();
		
		System.out.println("area = "+ a );
		
	}
	
}
package com.rays.polymorphism;

public class Testshape {
	
	public static void main (String [] args) {
		
		Shape s1 =  new Circle(2);
		Shape s2 =  new Rectangle(4,7);
		Shape s3 =  new Triangle (3,4);
		
		s1.area();
		s2.area();
		s3.area();
		
		
		
	}

}

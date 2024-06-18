package com.rays.oops;
import java.util.Scanner;


public class triangle extends Shape {
	
	  
		private int base ;
		private int  height;
		
		public int getBase(){
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
		
	 public double area () {
		 double area = base * height / 2  ;
		   
		  return area;
	 }
	 
	 public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 triangle t = new triangle ();
		 
		 System.out.println("enter dimension -- ");
		 
		 int base = sc.nextInt();
		 System.out.println("base = " + base);
		 
		 int height = sc.nextInt();
		 System.out.println("height =" + height);
		 
		 t.setBase(base);
		 t.setHeight(height);
		 t.setColor("matt blue");
		 
		 System.out.println("your output is ....................");
		 
		 
		 
		 double rt = t.area();
			
			System.out.println("area = "+ rt);
		    System.out.println("Color = "+ t.getColor());
		 
		    sc.close();
		}
	 
	}




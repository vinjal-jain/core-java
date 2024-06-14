package com.rays.javabasic;

import java.util.Scanner ;


public class reversedigit {
	public static void main(String[] args) {
		 Scanner value = new Scanner(System.in);
		 
		 System.out.println("Enter digit for reverse--");
		 int num = value.nextInt();
		 int temp = num;
		 int r;
		 int sum =0 ;
		 
		 while(temp > 0) {
			 r= temp%10 ;
			 
			 sum = (sum*10) +r ;
			 
			 temp =temp / 10;
			 
		 }
		 System.out.println(sum);
		 value.close();
	}
	

}

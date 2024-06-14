package com.rays.javabasic;

public class secondlargest {
	public static void main(String[] args) {
		int [] num = {40,30,70,100,120};
		int temp =0;
		int count = 0 ;
		
		for (int i =0 ; i<num.length; i++) {
			
			if (temp < num[i]) {
				count= temp; 
				temp = num[i];
			}
			if(count < num [i] && temp> num[i]) {
				count = num [i];
			}
				
		}
		System.out.println("second largest no. is " +  count);		
	
		
	}

}

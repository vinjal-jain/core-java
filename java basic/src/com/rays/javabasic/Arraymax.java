package com.rays.javabasic;

public class Arraymax {
public static void main(String[]args) {
	
	int[]arr = {2,3,7,8,10,23,45,60};
	int max = arr[0];
	
	for(int i =0; i <arr.length; i++) {
		
		if (arr[i]> max)
			max = arr[i];
			}
	System.out.println("the largest no. is "+ max);
	
}
}

package com.rays.javabasic;

import java.util.Scanner;

public class leapYear {
	public static void main(String[] args) {
		System.out.println("tell me year____");
		Scanner var = new Scanner(System.in);
		
		int year = var.nextInt();
		
		
		if (year % 4 == 0) {
			System.out.println(" is  leap year");
		} else {
			System.out.println("This year is not leap year");

		}
		var.close();
	}

}

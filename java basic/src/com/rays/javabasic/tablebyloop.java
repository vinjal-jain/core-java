package com.rays.javabasic;

import java.util.Scanner;

public class tablebyloop {
	public static void main(String[] args) {
		
	Scanner table = new Scanner(System.in);
	
	System.out.println("Which table do you want__");
	int num = table.nextInt();
	
	for(int i = 10; i>=1 ; i--
			) {
		
		System.out.println(num + "*" + i + "=" + num*i);
		}
		}

}

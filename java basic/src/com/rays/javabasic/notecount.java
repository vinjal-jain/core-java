package com.rays.javabasic;

import java.util.Scanner;

public class notecount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your amount");
		int rupees = scan.nextInt();
		
		int[] notes = {500,200,100,50,20,10,5,2,1};
		
		System.out.println("Total notes =" + notes.length);
		
		int count = 0;
		
		for (int i = 0; i< notes.length; i++) {
		
		count = rupees /notes [i];
		if(count>0) {
			System.out.println(notes[i] + "count="+count);
		}
		rupees = rupees % notes[i];
		
	}
		scan.close();

}
}

package com.rays.javabasic;
 
import java.util.Scanner;


public class palindrome {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your value");
		
		int n = sc.nextInt();
		
		int r ,sum=0,temp;
		
		temp = n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			}
		if(temp==sum) {
			System.out.println("Palidrome Number");
			}else {
				System.out.println("Not Palidrome ");
			}
		sc.close();
	}

}

package com.rays.javabasic;

import java.util.Scanner;

public class primenumber {
	public static void main(String[] args) {
		Scanner prime = new Scanner(System.in);

		System.out.println("Enter your number--");

		int num = prime.nextInt();
		boolean flag = false;

		for (int i = 2; i <= num / 2; ++i) {
			// Condition for nonprime no.

			if (num % i == 0) {
				flag = true;
				break;
			}
		}					

		if (!flag) {
			System.out.println(num + " is prime number");
		} else {
			System.out.println(num + "is not prime number");
		}

	}

}
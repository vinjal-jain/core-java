package com.rays.javabasic;  

import java .util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Double number1 , number2 , result;
		char operator;
		
		System.out.println("Choose your operator :- +,-,* or / ");
		
		Scanner input = new Scanner (System.in);
		operator = input.next().charAt(0);
		
		
		
		System.out.println("Enter first no. ");
		number1 = input.nextDouble();
		
		System.out.println("Enter second no.");
		number2 = input.nextDouble();
		
		switch(operator) {
		case '+' :
			result = number1 + number2 ;
			System.out.println(number1 + "+" + number2 + "=" + result );
			break;
			
		case '-' :
			result = number1 - number2 ;
			System.out.println(number1 + "-" + number2 + "=" + result );
			break;
			
		case '*' :
			result = number1 * number2 ;
			System.out.println(number1 + "*" + number2 + "=" + result );
			break;
			
		case '/' :
			result = number1 / number2 ;
			System.out.println(number1 + "/" + number2 + "=" + result );
			break;
		}
		input.close();
	}

}

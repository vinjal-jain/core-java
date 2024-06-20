package com.rays.oops;

import java.util.Scanner;

public class rectangle extends Shape {
	private int length;
	private int breath;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreath() {
		return breath;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}

	public double area() {
		double area = length * breath;

		return area;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		rectangle r = new rectangle();

		System.out.println("enter dimension -- ");

		int length = sc.nextInt();
		System.out.println("length = " + length);

		int breath = sc.nextInt();
		System.out.println("breath =" + breath);

		r.setLength(length);
		r.setBreath(breath);
		r.setColor("Orange");

		System.out.println("your output is ....................");

		double rt = r.area();

		System.out.println("area = " + rt);
		System.out.println("Color = " + r.getColor());

		sc.close();

	}
}

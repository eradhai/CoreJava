package com.project.operators;
/*
 * Logical AND --> &&
 * Logical OR --> ||
 * */
public class Logical {
	public static void main(String[] args) {
		boolean a=true;
		boolean b=false;
		
		boolean c=false;
		boolean d=true;
		
		System.out.println(" Vaue of a&&b is: " + (a&&b));//false
		System.out.println(" Vaue of a||b is: " + (a||b));//true
		System.out.println();
		System.out.println(" Vaue of c&&d is: " + (c&&d));//false
		System.out.println(" Vaue of c||d is: " + (c||d));//true
		System .out.println();
		System.out.println(" Vaue of Not(c&&d) is: " + !(c&&d));//true
		System.out.println(" Vaue of Not(c||d) is: " + !(c||d));//false
		
		
		
	}

}

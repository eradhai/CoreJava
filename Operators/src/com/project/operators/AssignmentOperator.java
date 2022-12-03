package com.project.operators;

public class AssignmentOperator {
	public static void main(String[] args) {
		//a=a+b is same as a+=b
		System.out.println("a=a+b is same as a+=b");
		System.out.println("a=10,b=2; initializing multiple values in same line is not allowed");
		System.out.println();
		
		int a=5;
		int b=2;
		System.out.println("Value of a = " +a);
		System.out.println("Value of b = " +b);
		System.out.println("Value of (a+=b) = " +(a+=b));
		System.out.println("Value of a = " +a);
		
		System.out.println();
		System.out.println("******************");
		
		a=5;
		b=2;
		System.out.println("Value of a = " +a);
		System.out.println("Value of b = " +b);
		System.out.println("Value of (a-=b) = " +(a-=b));
		System.out.println("Value of a = " +a);
		
		System.out.println();
		System.out.println("******************");
		
	    a=5;
	    b=2;
	    System.out.println("Value of a = " +a);
	    System.out.println("Value of b = " +b);
		System.out.println("Value of (a*=b) = " +(a*=b));
		System.out.println("Value of a = " +a);
		
		System.out.println();
		System.out.println("******************");
		
		//a=10,b=2; initializing multiple values is not allowed
		a=10;
		b=2;
		System.out.println("Value of a = " +a);
		System.out.println("Value of b = " +b);
		System.out.println("Value of (a/=b) = " +(a/=b));
		System.out.println("Value of a = " +a);
		
	}

}

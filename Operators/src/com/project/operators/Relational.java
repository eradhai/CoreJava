package com.project.operators;
// >,<,>=,<=,!

public class Relational {
	public static void main(String[] args){
		int a=100;
		int b=30;
		System.out.println("The result of a>b is: "+ (a>b));
		System.out.println("The result of a>=b is: "+ (a>=b));
		System.out.println("The result of a<b is: "+ (a<b));
		System.out.println("The result of a<=b is: "+ (a<=b));
		System.out.println("***********************************************");
		System.out.println("The result of Not(a>b) is: "+ !(a>b));
		System.out.println("The result of Not(a>=b) is: "+ !(a>=b));
		System.out.println("The result of Not(a<b) is: "+ !(a<b));
		System.out.println("The result of Not(a<=b) is: "+ !(a<=b));
	}

}

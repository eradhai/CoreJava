package com.project.operators;
// refer geeksforgeeks for TernaryOperator Diagram
public class TernaryOperator {
 public static void main(String[] args){
	 boolean result=(10>20)?true:false;
	 String City="Bangalore";//Variables and also Values are Case sensitive in Java
	 String isCapital=City.equals("bangalore")?"Capital of Karnataka":"Not Capital of Karnataka";
	 System.out.println("The value of result is: " + result);
	 System.out.println("The value of result is: " + isCapital);
 } 
}

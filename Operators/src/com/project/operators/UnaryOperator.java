package com.project.operators;
/*Pre Increament Operator        ++i -->First increament then assign
 * Post Increament Operator      i++ -->First assigned and then increament
 * Pre Decreament Operator       --i -->First decreament then assign
 * Post Decreament Operator      i-- -->First assigned and then decreament     */
public class UnaryOperator {
	public static void main(String[] args) {
		int i=50;
		
		System.out.println("********* Post Increament(i++) ************");
		
		System.out.println("i = " + i);
		int k=i++;
		System.out.println("k = " + k + " " + "i = " + i);
		
		System.out.println();
		System.out.println("********* Post Decreament(i--) ************");
		
		System.out.println("i = " + i);
		int l=i--;
		System.out.println("l = " + l+ " " + "i = " + i);
		
		System.out.println();
		System.out.println("**********Pre Increament(++i)***********");
		
		System.out.println("i = " + i);
		int m=++i;
		System.out.println("m = " + m+ " " + "i = " + i);
		
		System.out.println();
		System.out.println("********* Pre Decreament(--i) ************");
		
		System.out.println("i = " + i);
		int n=--i;
		System.out.println("n = " + n+ " " + "i = " + i);
			
	}
}

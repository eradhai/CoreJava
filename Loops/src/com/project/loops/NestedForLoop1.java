package com.project.loops;

public class NestedForLoop1 {
	public static void main(String[] args) {
		int count=1;
		int i,j;
		for(i=1;i<=2;i++) {
			for(j=1;j<=4;j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
		
	}

}

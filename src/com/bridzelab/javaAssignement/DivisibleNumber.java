package com.bridzelab.javaAssignement;

public class DivisibleNumber {

	public static void main(String[] args) {
		System.out.println("\nDivided by 3: ");		
		for (int i=1; i<50; i++) {
			if (i%3==0) 
			System.out.print(i +", ");			
		}			
				
		System.out.println("\n\nDivided by 5: ");
		for (int j=1; j<50; j++) {
			if (j%5==0) System.out.print(j +", ");			
		}
		
  }
}
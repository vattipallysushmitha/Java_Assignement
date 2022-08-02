package com.bridzelab.javaAssignement;

public class EvenOdd {

	public static void main(String[] args)
	{
	
		int sumA=0;
		int sumB=0;
		for(int i=1; i<=20; i++)
		{
			if(i%2!=0) {
			System.out.println(i);
			sumA=sumB+i;
			
			System.out.println(sumA);
			}
			
			else
			{
				System.out.println("\t" +i);
				
			}
			
		}
	}
}
		
			
package com.bridzelab.javaAssignement;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		System.out.println("Enter the  userinput  : ");  
		Scanner sc=new Scanner(System.in);  
		sc.nextInt();  
		  int sum=0;
		int[] array = new int[5];  
		for(int i=0; i<5; i++)  
		{  
		array[i]=sc.nextInt();  
		}  
		System.out.println("print the userinput in an array : ");  
		for (int i=0; i<5; i++)   
		{  
		System.out.println(" "+array[i]+" ");  
		sum=sum+array[i];
		}  
		System.out.println("addtion="+sum); 
	}	
		  
}

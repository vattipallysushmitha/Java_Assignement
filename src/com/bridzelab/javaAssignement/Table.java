package com.bridzelab.javaAssignement;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		int i;int total = 0;
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter  the number: ");       
		int num=sc.nextInt();  
		
		
		for(i=1; i <= 10; i++)  
		{  
		     
		System.out.println(num*i);   
			total = total+(num*i);
		}  
		System.out.println("Addition of table is:" +total);   

		}  
		}  
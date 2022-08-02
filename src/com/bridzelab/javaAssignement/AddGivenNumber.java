package com.bridzelab.javaAssignement;

import java.util.Scanner;

public class AddGivenNumber {

	public static void main(String[] args) {
		int digit,rev = 0,sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number :");
		int num = sc.nextInt();
		sc.close();
		int temp = num;
		while(num!=0)
		{
			digit = num%10;
			num = num/10;
			rev = rev*10+digit;
			sum = sum+digit;
		}
		System.out.println("reverse of"+temp+" is: "+rev);
	System.out.println("total:"+sum);
	}
}
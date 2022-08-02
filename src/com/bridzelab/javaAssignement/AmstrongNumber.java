package com.bridzelab.javaAssignement;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Enter the  userinput  : ");  
		Scanner sc=new Scanner(System.in);  
		int n=sc.nextInt();  
		int temp, rem, sum = 0;
		temp=n;

        while (temp!= 0)
        {
            rem = temp % 10;
            sum+= Math.pow(rem, 3);
            temp /= 10;
        }

        if(sum == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
}
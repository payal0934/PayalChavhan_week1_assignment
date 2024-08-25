package com.xenoxis;

import java.util.Scanner;

public class Program3{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		int a,b;
		System.out.println("enter the 1st number:");
		int a=sc.nextInt();
		System.out.println("enter the 2nd number:");
		int b=sc.nextInt();
		System.out.println("1: +");
		System.out.println("2: -");
		System.out.println("3: *");
		System.out.println("4: /");
//		System.out.print("");
		
		System.out.println("enter the operation to be performed:");
		int op=sc.nextInt();
		switch(op)
		{
		case 1:
			System.out.println("addition is:"+(a+b));
			break;
		
		case 2:
			System.out.println("subtraction is:"+ (a-b));
			break;
			
		case 3:
			System.out.println("multiplication is:"+ (a*b));
			break;
			
		case 4:
			System.out.println("division is:"+ (a/b));
			break;
			
		}
	}
}

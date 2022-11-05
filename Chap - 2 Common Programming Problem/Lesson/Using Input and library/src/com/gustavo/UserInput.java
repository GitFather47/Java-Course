package com.gustavo;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int a = input.nextInt();
		
		System.out.println("Enter another number: ");
		int b = input.nextInt();
		
		int sum = a + b;
		
		System.out.println("Sum = " + sum);
		// TODO Auto-generated method stub
     
	}

}

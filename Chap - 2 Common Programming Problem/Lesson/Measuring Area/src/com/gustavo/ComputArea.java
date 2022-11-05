package com.gustavo;

import java.util.Scanner;

public class ComputArea {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value as radius: ");
		double radius = input.nextDouble();
		
		double area = radius * radius * 3.1416;
		
		System.out.println("Area = " + area);
		// TODO Auto-generated method stub

	}

}

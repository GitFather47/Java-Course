package com.cubic;

import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Length= ");
		int l = input.nextInt();
		System.out.println("Enter Width= ");
		int w = input.nextInt();
		System.out.println("Enter Height= ");
		int h = input.nextInt();
		
		int z = l * w * h;
		System.out.println("Volume= " + z);
		// TODO Auto-generated method stub

	}

}

package com.point;

import java.util.Scanner;

public class points {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter wins= ");
		int w = input.nextInt();
		System.out.println("Enter draws= ");
		int d = input.nextInt();
		System.out.println("Enter losses= ");
		int l = input.nextInt();
		
		int z =w *3 +  d ;
		System.out.println("Total Points=  " + z);
		// TODO Auto-generated method stub

	}

}

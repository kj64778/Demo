package com.java.Easy_Level1;

import java.util.Scanner;

public class ScannerClass {

	public Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		float f;
		String str;

		ScannerClass run = new ScannerClass();
		System.out.println("Please Enter Integer Number");
		a = run.scan.nextInt();
		if (a <= 48) {
			for (int i = a; i <= 50; i += 2) {
				System.out.print(" " + i);
			}
		} else {
////		for (int i=100; i>=a; i-=2){
////			System.out.println(i);
////		}
			System.out.println("Input amount high, Please Enter Integer Number <=48");
		}
		System.out.println();

		System.out.println("Please Enter float Number");
		f = run.scan.nextFloat();
		if (f >= 50) {
			for (float i = 100; i >= f; i -= 2) {
				System.out.println(i);
			}
		} else {
			System.out.println("Input amount Low, Please Enter floating numner >=50");
		}

		System.out.println("Please Enter String Number");
		str = run.scan.next();

		for (int i = 0; i <= str.length() - 1; i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.valueOf(a));
		System.out.println(str.split("k", 5));
		System.out.println(str.length());
		System.out.println(str.replace('k', 'j'));
		

		System.out.println("int : " + a + " float : " + f + " String : " + str);

	}

}

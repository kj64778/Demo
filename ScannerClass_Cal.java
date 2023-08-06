package com.java.Easy_Level1;

import java.util.Scanner;

public class ScannerClass_Cal {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Add,sum,sub,mul,div
		 */
		String date, Year;
		float temperature;
		double Temperature;

		System.out.println("Please Enter Float Number so we can check temperature");

		temperature = scan.nextFloat();

		System.out.println("Please Enter Todays Date");

		date = scan.next();

		temperature = (((temperature - 32) * 5 / 9));

		System.out.println("Todays Date is : " + date + " Temperature :" + temperature + "^");

		System.out.println("-------------------------------------------------------");
		System.out.println("Please Enter Dobule Value");

		Temperature = scan.nextDouble();
		Temperature = (((Temperature-32)*5/9));
		System.out.println("Please Enter Year");

		Year = scan.next();
		
		System.out.println("Year : " + Year + " Temperature : " + Temperature);

	}

}

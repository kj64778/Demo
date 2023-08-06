package com.java.Easy_Level1;

public class Swap2_Variable_with_3rdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=500, b=250, temp;
		
		System.out.println("\n----------------Before Swap Variable");
		System.out.println("int A : "+a+ "\nint B : "+b+"");

		temp= a;
		a=b;
		b=temp;
		
		System.out.println("\n----------------After Swap Variable");
		System.out.println("int A : "+a+ "\nint B : "+b+"");
	}

}

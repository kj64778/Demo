package com.java.Easy_Level1;

public class pymid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 9; i++) {

			for (int k = 9; k >= i; k--)

				System.out.print(" ");
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------");

		for (int i = 1; i <= 9; i++) {

			for (int k = 9; k >= i; k--)
				System.out.print(" ");
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------------");

		for (int i = 1; i <= 9; i++) {

			for (int k = 9; k >= i; k--)
				System.out.print(" ");

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 9; i >= 1; i--) {

			for (int k = i; k <= 9; k++)
				System.out.print(" ");

			for (int j = i; j >= 1; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------");
		for (int i = 1; i <= 9; i++) {
			for (int k = 9; k >= i; k--)
				System.out.print(" ");
			for (int j = 1; j <= i; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		for (int i = 9; i >= 1; i--) {

			for (int k = i; k <= 9; k++)
				System.out.print(" ");

			for (int j = i; j >= 1; j--) {
				System.out.print("# ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------");
		for (int i = 1; i <= 9; i++) {

			for (int k = 9; k >= i; k--)
				System.out.print(" ");

			for (int j = 1; j <= i; j++) {
				System.out.print("@ ");
			}
			System.out.println();
		}

		for (int i = 9; i >= 1; i--) {

			for (int k = i; k <= 9; k++)
				System.out.print(" ");

			for (int j = i; j >= 1; j--) {
				System.out.print("@ ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------");
		for (int i = 1; i <= 9; i++) {
			for (int k = 9; k >= i; k--)
				System.out.print(" ");
			for (int j = 1; j <= i; j++) {
				System.out.print("& ");
			}
			System.out.println();
		}
		for (int i = 9; i >= 1; i--) {

			for (int k = i; k <= 9; k++)
				System.out.print(" ");

			for (int j = i; j >= 1; j--) {
				System.out.print("& ");
			}
			System.out.println();
		}

		System.out.println("-----------------------------------------------------------");

		for (int i = 1; i <= 9; i++) {
			for (int k = 9; k >= i; k--)
				System.out.print(" ");
			for (int j = 1; j <= i; j++) {
				System.out.print(i + j + " ");
			}
			System.out.println();
		}
		for (int i = 9; i >= 1; i--) {
			for (int k = i; k <= 9; k++)
				System.out.print(" ");
			for (int j = i; j >= 1; j--) {
				System.out.print(i + j + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------");

		for (int i = 1; i <= 9; i++) {
			for (int k = 9; k >= i; k--)
				System.out.print(" ");
			for (int j = 1; j <= i; j++) {
				System.out.print(i - j + " ");
			}
			System.out.println();
		}
		for (int i = 9; i >= 1; i--) {
			for (int k = i; k <= 9; k++)
				System.out.print(" ");
			for (int j = i; j >= 1; j--) {
				System.out.print(i - j + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------");
		
		for(int i=1; i<=9; i++) {
			for(int k=9; k>=i; k--)
				System.out.print(" ");
			for(int j=1; j<=i; j++) {
				System.out.print(j-i+" ");
			}
			System.out.println();
		}
		
		for(int i=9; i>=1; i--) {
			for(int k=i; k<=9; k++)
				System.out.print(" ");
			for(int j=i; j>=i; j--) {
				System.out.print(j-i+" ");
			}
			System.out.println();
			
		}
		System.out.println("-----------------------------------------------------------");
		
		for(int i=1; i<=9; i++) {
			for(int k=9; k>=i; k--)
				System.out.print(" ");
			for(int j=1; j<=i; j++) {
				System.out.print(i/j+" ");
			}
			System.out.println();
		}
		for(int i=9; i>=1; i--) {
			for(int k=i; k<=9; k++)
				System.out.print(" ");
			for(int j=i; j>=1; j--) {
				System.out.print(i/j+" ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------------");
		
		for(int i=1; i<=9; i++) {
			for(int k=9; k>=i; k--)
				System.out.print(" ");
			for(int j=1; j<=i; j++) {
				System.out.print(4+" ");
			}
			System.out.println();
		}
		for(int i=8; i>=1; i--) {
			for(int k=i; k<=9; k++)
				System.out.print(" ");
			for(int j=i; j>=1; j--) {
				System.out.print(4+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------NotePad-------------------");
		
		for(int i=0; i<=9; i++){
			
			for(int k=9; k>=i; k--)
			System.out.print(" ");

			for(int j=0; j<=i; j++){
			System.out.print("* ");

			}
			System.out.println();
			}

	}

}

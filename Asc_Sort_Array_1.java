package com.java.Easy_Level1;

public class Asc_Sort_Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20,90, 50, 80, 70, 60 };

		int tempt = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					tempt = arr[i];
					arr[i] = arr[j];
					arr[j] = tempt;
				}
			}
		}

		for (int a : arr) {
			System.out.println(a);
		}

		System.out.println("-------------------------------------------------------------");
		pymid();
		System.out.println("------------------------------------------------------");
		reverEachWord("Kiran Chhagan Jadhav");
		System.out.println("------------------------------------------------------------");
		integerPalimdrom(1234321);

	}

	public static void pymid() {
		for (int i = 0; i < 9; i++) {
			for (int k = 9; k >= i; k--)
				System.out.print(" ");
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 9; i > 0; i--) {
			for (int k = i; k <= 9; k++)
				System.out.print(" ");
			for (int j = i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void reverEachWord(String str) {
		String[] words = str.split(" ");

		String reversalEachW = "";
		String word = "";

		for (int i = 0; i < words.length; i++) {
			word = words[i];

			String rev = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				rev = rev + word.charAt(j);
			}
			reversalEachW = reversalEachW + rev + " ";
		}
		System.out.println(reversalEachW);
	}

	public static void integerPalimdrom(int number) {
		int org = number, r, sum = 0;

		while (org > 0) {
			r = org % 10;
			sum = (sum * 10) + r;
			org = org / 10;
		}
		System.out.println("Original Number : " + number);
		System.out.println("Reversal Number : " + sum);

		if (number == sum) {
			System.out.println("This is Palimdrom Number");
		} else {
			System.out.println("This is not Palimdrom Number");
		}
	}

}

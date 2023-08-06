package com.java.Easy_Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IMP_Question {

	public void StringReversal() {

		String str = "Kiran";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		System.out.println("Reversal the String str : " + rev);
		System.out.println("-----------------String rev via String Buffer--------------------");

		StringBuffer strBuff = new StringBuffer(str);

		System.out.println("String rev : " + strBuff.reverse());

		System.out.println("-------------Rev Integer value------------------");

		int num = 12345;
		int r, sum = 0, org = num;

		while (org != 0) {
			r = org % 10;
			sum = (sum * 10) + r;
			org = org / 10;
		}
		System.out.println("Original value of : " + num);
		System.out.println("Reversal value of : " + sum);

		System.out.println("Integer Number into String via Integer.toString");

		String str1 = Integer.toString(num), rev1 = "";

		for (int i = str1.length() - 1; i >= 0; i--) {
			rev1 = rev1 + str1.charAt(i);

		}
		System.out.println("Reversal the String str : " + rev1);

	}

	public void StringVowels(String input) {
		input = input.toUpperCase().replace(" ", "");
		int vowels = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'A' || input.charAt(i) == 'E' || input.charAt(i) == 'I' || input.charAt(i) == 'O'
					|| input.charAt(i) == 'U') {

				System.out.println(input.charAt(i) + " " + i);
				vowels++;
			}
		}
		System.out.println("Total Vowels is : " + vowels);

	}

	public String removeWhitespaces(String str) {
		StringBuffer output = new StringBuffer();

		char[] chartoString = str.toCharArray();

		for (char a : chartoString) {
			if (Character.isWhitespace(a))
				output.append(a);
		}
		System.out.println(str);
		return output.toString();
	}

	public void listContainsOddNumber() {
		int[] arr = { 10, 5, 3, 8, 14, 15, 13, 52 };
		
//		Arrays.sort(arr);
		
		List<Integer> list = new ArrayList<>();

		for (int a : arr) {
			list.add(a);
		}
		System.out.println("List print : " + list);

		for (int a : list) {

			if (a % 2 == 0) {

			} else {
				System.out.println("List Odd Number : " + a);

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IMP_Question run = new IMP_Question();

		run.StringReversal();
		System.out.println("------------StringVowels method--------------");
		run.StringVowels("Kiran Jadhav I am a Software Tester");

		System.out.println("-----------------------------------------------");
		run.listContainsOddNumber();
	}

}

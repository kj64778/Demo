package com.java.Easy_Level1;

public class Asc_sort_Array {
	int tempt;

	public void shorting(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					if(arr[i]==0) {
						
						
					tempt = arr[i];
					arr[i] = arr[j];
					arr[j] = tempt;
				}
				}
			}
		}

		for (int a : arr) {
			System.out.println(a);
		}
	}

	public void notepad() {

		int[] arr1 = { 10, 20, 50, 90, 5, 45 };
		int tempt;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i; j < arr1.length; j++) {

				if (arr1[i] > arr1[j]) {
					tempt = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = tempt;

				}
			}
		}
		for (int a : arr1) {

			System.out.println(a);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Asc_sort_Array run = new Asc_sort_Array();

		int[] arr = { 10, 5, 20, 8, 45, 3 };
		int tempt;
		System.out.println("--------Original Array-----------");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					tempt = arr[i];
					arr[i] = arr[j];
					arr[j] = tempt;
				}
			}

		}

		System.out.println("\n---------After Asc Array--------------");

		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();

		String name = "12321";

		String rever = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			rever = rever + name.charAt(i);
		}
		System.out.println(name);
		System.out.println(rever);

		if (name.equals(rever)) {
			System.out.println("It is Palimdrom : " + name);
		} else {
			System.out.println("It is not palimdrom : " + name);
		}
		System.out.println("Shorting Array with method");

		run.shorting(arr);

		System.out.println("--------------Notepad-----------------");

		run.notepad();

	}

}

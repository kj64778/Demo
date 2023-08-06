	package com.java.Easy_Level1;

public class IntergerNumberReversa {
	int n = 1234321, r, sum = 0;

	public void IntegerNumberReversalWithString() {
		String str = Integer.toString(n);

		String revers = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revers = revers + str.charAt(i);

		}

		System.out.println(revers);
	}

	public void IntegerNumberReversalWithWhile() {
		int org = n;
		while (n > 0) {
			r = n % 10;

			sum = (sum * 10) + r;

			n = n / 10;
		}
		System.out.println(org);
		System.out.println(sum);
		if(org==sum) {
			System.out.println("This is Palimdrom String");
		}else {
			System.out.println("This is not a Palimdrom String");
		}
	}
	
	public void StringPalimdrom() {
		
		String rev="", name = "MADAM";
		
		for(int i=name.length()-1; i>=0; i--) {
			rev = rev+name.charAt(i);
		}
		
		System.out.println("Original String : "+name);
		System.out.println("Reversal String : "+rev);
		
		if(name.equalsIgnoreCase(name)) {
			System.out.println("This is Palimdrom String");
		}else {
			System.out.println("This is not a Palimdrom String");
		}
		
		
		
		
	}
	
	public static void StringPalimdrom(int a) {
		System.out.println(a);
	}
	

	public static void main(String[] args) {
	
		IntergerNumberReversa run = new IntergerNumberReversa();
		
		run.IntegerNumberReversalWithString();
		run.IntegerNumberReversalWithWhile();
		run.StringPalimdrom();
		StringPalimdrom(10);
		
		
		
	}

}

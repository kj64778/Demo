package com.java.Easy_Level1;

public class EachWordRevers {
	
	public static void eachWord(String str) {
		String [] words = str.split(" ");
		
		String reversalWord="";
		String eachWord;
		
		for(int i=0; i<words.length; i++) {
			
			eachWord = words[i];
			
			String rev="";
			for(int j=eachWord.length()-1; j>=0; j--) {
				rev = rev+eachWord.charAt(j);
			}
			reversalWord = reversalWord+rev+" ";
		}
		System.out.println(reversalWord);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eachWord("Kiran Jadhav");

	}

}

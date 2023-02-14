package Strings;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String input=sc.nextLine();
		System.out.println("input:"+input);
		int upperCaseLetterCount=0;
		int lowerCaseLetterCount=0;
		int digitsCount=0;
		int specialCaseLetterCount=0;
		char[]characters=input.toCharArray();
		for(char ch:characters) {
			if(Character.isUpperCase(ch))
				upperCaseLetterCount++;
			else if(Character.isLowerCase(ch))
				lowerCaseLetterCount++;
			else if(Character.isDigit(ch))
				digitsCount++;
			else
				specialCaseLetterCount++;
			
			
		}
		System.out.println("output:");
		System.out.println("upperCaseLetterCount:"+upperCaseLetterCount);
		System.out.println("lowerCaseLetterCount:"+lowerCaseLetterCount);
		System.out.println("digitsCount:"+digitsCount);
		System.out.println("specialCaseLetterCount:"+specialCaseLetterCount);
	}

}

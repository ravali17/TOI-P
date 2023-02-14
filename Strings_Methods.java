package Strings;

import java.util.Arrays;

public class Strings_Methods {
	public static void main(String args[]) {
		String s1="hello";
		String s2=new String("HELLO");
		String s3="hello";
		String s4=new String("hello");
		String s5=new String("cello");
		String s6=new String(" hello world ");
		String s7="hello world how are you?";
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s1.equals(s2));//equals()
		System.out.println(s1.equalsIgnoreCase(s2));//
		System.out.println(s1.contains("H"));
		System.out.println(s1.contains("ll"));
		System.out.println(s2.startsWith("he"));
		System.out.println(s2.endsWith("o"));
		System.out.println(s6.length());
		System.out.println(s6.trim());
		System.out.println(s6.trim().length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
	
	int i;
	i=s1.compareTo(s4);
		if(i==0) {
			System.out.println("Strings are equal");
			
		}
		else {
			System.out.println("Strings are not equal");
		}
	
//		int i;
//		i=s1.compareToIgnoreCase(s2);
//		if(i==0) {
//			System.out.println("Strings are equal");
//			
//		}
//		else {
//			System.out.println("Strings are not equal");
//		}

		System.out.println(s6.indexOf('w'));
		System.out.println(s6.lastIndexOf('l'));
		System.out.println(s6.substring(2));
		System.out.println(s6.substring(2,5));
		System.out.println(Arrays.toString(s7.split(" ")));
		System.out.println(s1.replace("hello","cello"));
	}

}

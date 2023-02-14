package Strings;

public class Strings_ex {

	public static void main(String[] args) {
		String s="welcome to india";
		String s2="welcome to india";
		String s1=new String("hello");
		String s3=new String("hello");
		
		int len=s.length();
		int len1=s1.length();
		System.out.println(s.charAt(len-1));
		System.out.println(s1.charAt(0));
		if(s==s1) {
			System.out.println("equal");
			
		}else {
			System.out.println("not equal");
		}
		System.out.println();/////////////////////////////
		if(s==s2) {
			System.out.println("equal");
			
		}else {
			System.out.println(" not equal");
		}
		System.out.println();/////////////////////////////
		if(s1==s3) {
			System.out.println("equal");
			
		}else {
			System.out.println(" not equal");
		}
		System.out.println();///////////////////////////////
		if(s.equals(s2)) {
			System.out.println("equal");
			
		}else {
			System.out.println(" not equal");
		}
	
		System.out.println();///////////////////////////////
		if(s1.equals(s3)) {
			System.out.println("equal");
			
		}else {
			System.out.println(" not equal");
		}
		
		
		
		System.out.println();///////////////////////////////
		String str="123";
	    int inum = 100;

	    /* converting the string to an int value
	     * ,the value of inum2 would be 123 after
	     * conversion
	     */
	    int inum2 = Integer.parseInt(str);

	    int sum = inum+inum2;
	    System.out.println("Result is: "+sum);
		}
	}



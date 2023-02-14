package Strings;

public class Reverse_String {

		public static String reverseWord(String str){  
		    String words[]=str.split("\\s");  
		    String reverseWord="";  
		    for(String w:words){  
		        StringBuilder sb=new StringBuilder(w);  
		        sb.reverse();  
		        reverseWord+=sb.toString()+" ";  
		    }  
		    return reverseWord.trim();  
		}  
	
			public static void main(String[] args) {  
			    System.out.println(Reverse_String.reverseWord("how are you?"));  
			    System.out.println(Reverse_String.reverseWord("NEELAKANTAM"));    
			    }  
			}  
		 


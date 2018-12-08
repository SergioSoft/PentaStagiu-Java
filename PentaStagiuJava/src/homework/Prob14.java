package homework;
/*
Write a program to test whether a given string is a palindrome or not

For example
Given the following string “aaabccbaaa” should return TRUE
Given the following string “abccbb” should return FALSE
*/
public class Prob14 {

	public static void main(String[] args) {
		String str = "aaabccbaaa";
		String str2 = "abccbb";
		String reverse  = "";
		  int n = str.length();
		    for( int i = n-1; i >=0; i--) {
		    	reverse = reverse + str.charAt(i);	  
		    }
		        if (str.equals(reverse)) {
		        	System.out.println("TRUE");				
		        }else {
		        	System.out.println("FALSE");    

		        }

		}
	}

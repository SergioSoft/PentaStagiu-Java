package homeworkWeek2;
/*
 Write a program that will return a different string representing the alphabet index of each letter.

Assuming we have the following alphabet encoding

a = 0
b = 1
c = 2
d = 3
…

For the given string “abcd” the output should be “0123”

 */
public class Prob9 {

	public static void main(String[] args) {
		   String str = "abcd";
		   StringBuilder result = new StringBuilder("");

	        for( char c : str.toCharArray() )
	        {
	            result.append( c - 'a' );
	        }

	        System.out.println(result.toString());
		}
	
}

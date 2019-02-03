package homeworkWeek2;
/*
Write a program that will count how many times a character appears in a String

For example
Given the string “Hello java world” and the target character ‘a’ the output should be 2 
(since ‘a’ appears twice in “Hello java world”)
*/
public class Prob11 {

	public static void main(String[] args) {
		String str = "Hello java world";
		String strTarget = "l";
		int count  = 0;
			for (int i=0; i<str.length(); i++ ) {
				if(str.charAt(i) == strTarget.charAt(0)) {
					count++;
					
				}
			}
		System.out.println(count);
	}

}

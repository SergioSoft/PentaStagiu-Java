package homeworkWeek2;

/*
Write a program that test if a given String contains another String.
For example
Given the following base String “Hello java world” and the target test String “java” the output should be TRUE
 */
public class Prob10 {

	public static void main(String[] args) {
		String str = "Hello java world";
		String strTarget = "java";
			if (str.contains(strTarget)) {
					System.out.println("True");
			} else {
					System.out.println("False");
			}
		

	}

}

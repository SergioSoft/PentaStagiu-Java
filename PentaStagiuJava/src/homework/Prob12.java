package homework;
/*
  Write a program that will test whether a string ends with another string

For example
Given the following strings “Hello java world” and “orld” the output should be TRUE
 */
public class Prob12 {

	public static void main(String[] args) {
		String str = "Hello java world";
		String strTarget = "orld";
			if (str.endsWith(strTarget)) {
				System.out.println("TRUE");				
			}else {
				System.out.println("FALSE");
			}
		

	}

}

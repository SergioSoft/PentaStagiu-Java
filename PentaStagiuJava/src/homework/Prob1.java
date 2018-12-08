package homework;
/*
Write a program that will sum up all numbers from 0 up to a target number.
For example, for an input number 5, result should be 15 (0+1+2+3+4+5)
 */
	public class Prob1 {
	  public static void main(String args[]) {
			int myTarget = 5;

			int res = 0;
			for (int i = 0; i <=myTarget; i ++) {
				res = res  + i;
			}


			System.out.println("Sum is " + res);
	  }

}
 
	    	
	

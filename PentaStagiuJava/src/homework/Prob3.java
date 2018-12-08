package homework;
/*
Write a program that will print the first x fibonacci numbers. Also calculate the average value. For example
For an input of x = 20 the output should be:

The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5
*/
public class Prob3 {

	public static void main(String[] args) {
		 int firstNumber = 0;
		 int secondNumber= 1;	 
		 int thirdNumber;		     		          
		 int input = 20;
		 int fibonacci;
		      			
		         for (int i=0;i<input;i++) {		            		
		             thirdNumber = firstNumber + secondNumber;		 
		             firstNumber = secondNumber;
		             secondNumber = thirdNumber;
		             fibonacci = firstNumber;
		            
		             System.out.print( fibonacci + " ");

	}

}
}
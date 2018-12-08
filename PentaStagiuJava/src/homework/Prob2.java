package homework;
/*
Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.

For example, for range numbers 1 to 100 output should be:

Sum for range 1 to 100 : 5050
Average for range 1 to 100 : 50.5
*/
public class Prob2 {
       static int Sum(int a , int b) {
		 return  a + b ; 
       }
       
       static int Averange(int a , int b) {
    	   return (a + b)/2;
       }
	public static void main(String[] args) {
		System.out.println("Sum is:" + Sum(1,2));
		System.out.println("Averange is:" + Averange(30, 50));
		
		
		}
	}



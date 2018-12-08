package homework;
/*
 Write a program that test whether 2 int arrays are equal. Equality in this case means that both arrays have the same number of elements an element on a specific index in first array is equal to the element on the same index in the second array.

For example

For the following arrays [1,2,3,4] and [1,2,3,4] the output should be TRUE
For the following arrays [] and [] the output should be TRUE
For the following arrays [1,3,2] and [1,3] the output should be FALSE
For the following arrays [1,2,3,4] and [1,2,4,3] the output should be FALSE
 */
import java.util.Arrays;

public class Prob5 {

	public static void main(String[] args) {
		int arr[] ={1,2,3,5};   
		int arr2[] ={1,2,3,5}; 
		if  (Arrays.equals(arr, arr2))  {
			 System.out.println("TRUE");
			 
		} else {
			 System.out.println("FALSE");          			
		}  

	}

}

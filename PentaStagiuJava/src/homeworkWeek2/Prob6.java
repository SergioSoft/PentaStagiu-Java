package homeworkWeek2;
/*
 Write a java program that will concatenate 2 arrays. 
For example
Given 2 arrays [1,2,3,4] and [5,6,7,8] the output should be a new array containing [1,2,3,4,5,6,7,8]

 */

import java.util.Arrays;

public class Prob6 {

	public static void main(String[] args) {
		int arr[] ={1,2,3,5};   
		int arr2[] ={1,2,3,5,5,7,2};
		int ArrayConcat[] = new int[arr.length + arr2.length];
			System.arraycopy(arr, 0, ArrayConcat, 0, arr.length);
			System.arraycopy(arr2, 0, ArrayConcat, arr.length, arr2.length);
				System.out.print("Array is :" + Arrays.toString(ArrayConcat));
		 }
		

	}



package homework;
/*
 Write a java program to return the index of a target element.

For example:
Given  the following array [13,20,14,5,2,8] and a target element 5 
the output should be : 3 (because 5 is located at index 3 in the array)
 */
public class Prob8 {
	
	public static void main(String[] args) {
		int arr[] ={1,9,6,13,1, 5};
		int target = 13;
		 for (int i = 0; i<arr.length; i++) {
			 if (arr[i] == target) {
				 System.out.println("Element " + target +" is on index: " + i);
			 }
		 }
	}
}

package homeworkWeek2;

/*
 
Write a java program that will return the min, max and average values in a given array.

For example 
GIven the following array [13,20,14,5,2,8] the output should be
Max : 20
Min : 2
Average: 10.3

 */
import java.util.Arrays;

public class Prob7 {

	public static void main(String[] args) {
		
		
		int arr[] ={1,9,5,13,1, 5};
		averange(arr);
		max(arr);
		min(arr);
	}	
	
	private static void averange(int averangeArray[]) {	
		     int sum =0;
		     for (int i = 0; i<averangeArray.length; i++) 
				sum = sum + averangeArray[i];
				float averange = (float)(sum/averangeArray.length);
						System.out.println("Averange is: " + averange );
				}
	private static void max(int [] maxArray) {
		int max = 0;		
		Arrays.sort(maxArray);
		max = max + maxArray[maxArray.length -1];
		System.out.println("Max is : " + max);
	}
	private static void min(int [] minArray) {
		int min = 0;		
		Arrays.sort(minArray);
		min = min + minArray[0];
		System.out.println("Min is: " + min);
	}
}

	



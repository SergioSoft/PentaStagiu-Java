package homeworkWeek2;
/*
 Write a java program that will test whether the first and the last element of an int array are the same. We can assume the array has 2 or more elements.

For example:
For the following input [13,6,2,8,2,3] the output should be : FALSE
For the following input [13,6,2,8,2,13] the output should be : TRUE
 */
public class Prob4 {
	public static void main(String[] args) {
		int arr[] ={13,6,2,8,2,3};    			      	
        		if  (arr[0] == arr[arr.length -1])  {
        			 System.out.println("TRUE");
        			 
        		} else {
        			 System.out.println("FALSE");          			
        		}  
        	}
        
	}

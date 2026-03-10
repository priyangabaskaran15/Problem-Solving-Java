/* Geeks For Geeks : 
Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest 
element.
Given an array of positive integers arr[], return the second largest
element from the array. If the second largest element doesn't exist then 
return -1.

Note: The second largest element should not be equal to the
largest element. 

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34

Input: arr[] = [10, 10, 10]
Output: -1
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array Size: ");
		int array_size = sc.nextInt();
		int arr[] = new int[array_size];
		System.out.print("Enter values: ");
		for(int i=0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		int max1 = arr[0];
		int max2 = -1;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]>max1){
		        max2 = max1;
		        max1 = arr[i];
		    }
		    else if(arr[i]>max2 && arr[i]!=max1){
		        max2=arr[i];
		    }
		}
		System.out.print("Second Largest: "+max2);
		
		
		
	}
}

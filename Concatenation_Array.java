/* You are given an integer array nums of length n.
Create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] 
for 0 <= i < n (0-indexed). Specifically, ans is the concatenation of two nums arrays.
Return the array ans.
 Example : Input: nums = [1,4,1,2] Output: [1,4,1,2,1,4,1,2]
 */

import java.util.*;
public class Concatenation_Array{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array_size: ");
        int array_size = sc.nextInt();
        int arr[] = new int[array_size];
        System.out.print("Enter array values: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int new_arr[] = new int[2*array_size];
        for(int i=0;i<array_size;i++){
            new_arr[i] = arr[i];
            new_arr[i+array_size] = arr[i];
        }
        for(int i=0;i<2*array_size;i++){
            System.out.print(new_arr[i]+" ");
        }
    }
}
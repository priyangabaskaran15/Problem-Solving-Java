// Problem Statement : 
/* You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.

Examples:

Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.
Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.*/ 
import java.util.*;
public class missing_value_in_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int arr[] = new int[n];
        for(int i=0;i<arr.length-1;i++){
            arr[i] = sc.nextInt();
        }
        
        int exp_result = n*(n+1)/2;
        int act_result = 0;
        for(int i=0;i<arr.length;i++){
            act_result+=arr[i];
        }
        int missing_value = exp_result - act_result;
        System.out.println("Missing Value: "+missing_value);
    }
}


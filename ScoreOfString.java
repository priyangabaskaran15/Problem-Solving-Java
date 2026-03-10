/* You are given a string s. The score of a string is defined as the sum of the 
absolute difference between the ASCII values of adjacent characters.
 Return the score of s. 
 Example 1: Input: s = "code" Output: 24 */
 import java.util.*;
public class ScoreOfString {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int score = 0;
        for(int i=0;i<s.length()-1;i++){
            score+=  Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        System.out.println(score);
    }
    
}

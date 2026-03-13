import java.util.*;
public class length_of_last_word {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.trim(); // To remove spaces at beginning and end 
        int last_space = s.lastIndexOf(" ");
        System.out.println(s.length()-last_space-1);
    }
}

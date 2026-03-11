// Method 1: Print true if the array contains duplicate , otherwise print false 
import java.util.Arrays;
public class check_duplicates{
    public static void main(String[]args){
            int arr[] = {1,2,3,1};
            boolean isduplicate = false;
            Arrays.sort(arr);
            for(int i=0;i<arr.length-1;i++){
                    if(arr[i]==arr[i+1]){
                        isduplicate = true;
                        break;
                    }          
            }
            System.out.println((isduplicate));  
    }
}


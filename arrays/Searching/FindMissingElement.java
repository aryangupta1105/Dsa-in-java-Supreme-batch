import java.lang.*;
import java.util.*;

public class FindMissingElement{
    static int findMissingElement(int [] arr){
        int start = 0; 
        int end = arr.length -1; 
        int mid = 0;
        while(start <=end){
            mid = start + (end -start)/2;
            if(mid - start != arr[mid] - arr[start])
            {
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String args[]){
        int arr1[] = {1 , 2, 3 ,4 ,5, 6 ,7 , 8 , 9 , 11 , 12 , 13};
        int ans = findMissingElement(arr1);
        System.out.println(ans);

    }
}
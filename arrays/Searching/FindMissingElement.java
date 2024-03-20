import java.lang.*;
import java.util.*;

public class FindMissingElement{
    static int findMissingElement(int [] arr){
        int start = 0; 
        int end = arr.length -1; 
        int mid = 0;
        while(start<end){
            mid = start + (end - end)/2;
            if((arr[mid] - arr[start])  == (mid - start)){
                start = mid + 1;
                if(mid == end) return mid+1;
            }
            else{
                end = mid;
            }
        }
        return mid;
        }

    static int findMissingElementBySum(int [] arr){
        int n = arr.length + 1;
        int sum = n* (n +1 )/2;
        int sum2  = 0;
        System.out.println(sum);
        for(int i = 0; i<arr.length; i++){
            sum2 += arr[i];
        }
        System.out.println(sum2);
        int missing = sum - sum2;
        return missing;
    }
    
    public static void main(String args[]){
    // <---------------------FIND MISSING ELEMENT BY BINARY SEARCH------------------------>

        int arr1[] = {1 , 2, 3 ,5, 6 ,7 , 8 , 9 , 10 , 11 , 12};
        int ans = findMissingElement(arr1);
        System.out.println(ans);

    // <---------------FIND MISSING ELEMENT BY SUM--------------------------->
        // int arr2[] = {1 , 2, 3 ,4 ,5, 6 ,7 , 8 , 9 , 10 , 11 , 13};
        // int ans1 = findMissingElementBySum(arr2);
        // System.out.println(ans1);

    }
}
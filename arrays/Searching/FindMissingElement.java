import java.lang.*;
import java.util.*;

public class FindMissingElement{
    static int findMissingElement(int [] arr){
        int start = 0; 
        int end = arr.length -1; 
        int mid = 0;
        while(start<end){
            mid = start + (end - start)/2;
            if((arr[mid] - mid == 1)){
                start = mid+1;
            }
            else if(arr[mid] - mid != 1){
                end = mid;
            }
            if(start == arr.length - 1 ) {
                // If so, return the missing element
                return arr[start] + 1;
            }
            if(arr[0] != 1) return 1;
        }
        return start+1;
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

        int arr1[] = {1,2,3,4,5,7,8 , 9};
        int ans = findMissingElement(arr1);
        System.out.println(ans);

    // <---------------FIND MISSING ELEMENT BY SUM--------------------------->
        // int arr2[] = {1 , 2, 3 ,4 ,5, 6 ,7 , 8 , 9 , 10 , 11 , 13};
        // int ans1 = findMissingElementBySum(arr2);
        // System.out.println(ans1);

    }
}
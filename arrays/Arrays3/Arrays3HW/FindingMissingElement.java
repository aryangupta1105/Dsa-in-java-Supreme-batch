import java.lang.*;
import java.util.*;

public class FindingMissingElement{


     static void swap(int [] a , int i , int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static int FindMissingElementVisitingM(int [] arr){
        int ans = -1;
        for(int i = 0; i<arr.length; i++){
            int index = Math.abs(arr[i]);
            if(arr[index -1 ] > 0){
                arr[index-1] *= -1;
            }
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > 0){
                ans = i+1;
            }
        }
        return ans;
    }

    static void swapNsortMissing(int [] arr){
        for(int i = 0 ;i<arr.length;){
            int Index = arr[i]-1;
            if(arr[Index] != arr[i])
            {
                swap(arr , Index , i);
            }
            else{
                i++;
            }
        }
        
        // for(int x:arr) 
        // System.out.print(" " + x);
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != i+1) 
            System.out.print(i+1 + " ");
        }
    }


    public static void main(String args[]){


// <---------------------FINDING MISSING NUMBER USING Visiting------------------->
        int arr[] = {1,3,5,3,4};
       int missing=  FindMissingElementVisitingM(arr);
        System.out.println("The missing element is at Index: " + missing);


// <---------------------FINDING MISSING NUMBER USING SORT AND SWAP------------------->
        int A[] = {1,2,4,4,4};
       swapNsortMissing("The missing elements are : " + A);

    }
}
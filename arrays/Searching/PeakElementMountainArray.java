import java.lang.*;
import java.util.*;

public class PeakElementMountainArray{
    static int findingPeakElement(int arr[]){
        int start = 0; 
        int end = arr.length-1;
        int mid = 0;
        while(start<end){
            mid = start + (end-start)/2;
            if(arr[mid] < arr[mid+1])
                start = mid+1;
            else{
                end = mid;
            }
        }
        return arr[start];
    }
    static int findingPivotIndex(int arr[]){
        int start = 0; 
        int end = arr.length-1;
        int mid = 0;
        while(start<end){
            mid = start + (end-start)/2;
            if(arr[mid] > arr[end])
                start = mid+1;
            else{
                end = mid;
            }
        }
        return start;
    }
    static int SearchInRotatedArray(int arr[] , int key){
        int start = 0; 
        int end = arr.length-1;
        int mid = 0;
        while(start<end){
            mid = start + (end-start)/2;
            if(arr[mid] == key)
                return mid;
            if((key < arr[mid]) && (key>=arr[end]))
                end = mid;
            else start = mid+1;
        }
        return start;
    }
    public static void main(String args[]){
        int arr[] = {0 , 8 , 15 , 3 , 2 , 1};
        System.out.println("The peak element is : " + findingPeakElement(arr));
        int arr2[] = {6, 7 , 8 , 1 ,2, 3 ,4 ,5};
        System.out.println("The pivot element is at : " + findingPivotIndex(arr2));
        int arr3[] = {6, 7 , 8 , 1 ,2, 3 ,4 ,5};
        System.out.println("The peak element is at : " + SearchInRotatedArray(arr2 , 1));
    }
} 
import java.lang.*;
import java.util.*;

public class searching{
    static int BinarySearchAlgo(int arr[] , int target){
        int start = 0; 
        int end = arr.length-1;
        while(start <= end){
            // int mid = (start + end)/2; //There is some issue in this line
            int mid = (start + end + (start - end) )/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                start = mid + 1;
            }
            if(arr[mid] > target){
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[] = {2 ,3, 23 ,43 ,45 ,64 ,69 ,70};
        System.out.println("The element is present at index : " + BinarySearchAlgo(arr , 69));
    }
}
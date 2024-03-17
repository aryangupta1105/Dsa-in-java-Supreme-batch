import java.lang.*;
import java.util.*;

public class searching{
    static int BinarySearchAlgo(int arr[] , int target){
        int start = 0; 
        int end = arr.length-1;
        while(start <= end){
            // int mid = (start + end)/2; //There is some issue in this line(INTEGER OVERFLOW)
            int mid = start + (end - start) /2;
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
    static int firstOccurenceBSearch(int arr[] , int target){
        int start = 0; 
        int end = arr.length-1;
        int index = -1;
        while(start <= end){
            // int mid = (start + end)/2; //There is some issue in this line(INTEGER OVERFLOW)
            int mid = start + (end - start) /2;
            if(arr[mid] == target){
                index = mid;
                end = mid-1;
            }
            if(arr[mid] < target){
                start = mid + 1;
            }
            if(arr[mid] > target){
                end = mid-1;
            }
        } 
        
        return index;
    }
    static int lastOccurenceBSearch(int arr[] , int target){
        int start = 0; 
        int end = arr.length-1;
        int index = -1;
        while(start <= end){
            // int mid = (start + end)/2; //There is some issue in this line(INTEGER OVERFLOW)
            int mid = start + (end - start) /2;
            if(arr[mid] == target){
                index = mid;
                start = mid+1;
            }
            if(arr[mid] < target){
                start = mid + 1;
            }
            if(arr[mid] > target){
                end = mid-1;
            }
        }
        return index;
    }

    
    static int totalOccurenceBSearch(int arr[] , int target){
        int firstIndex = firstOccurenceBSearch(arr , target);
        int lastIndex = lastOccurenceBSearch(arr , target);
        int totalOccurrence = lastIndex - firstIndex +1;
        return totalOccurrence;
    }
    public static void main(String args[])
    {
// <------------------------------BINARY SEARCH-------------------------------->

        int arr[] = {2 ,3, 23 ,43 ,45 ,64 ,69 ,70};
        int index = Arrays.binarySearch(arr , 69);
        System.out.println("The element is present at index : " + BinarySearchAlgo(arr , 69));
        System.out.println("The element is present(by Binary Search predefined) at index : " + index);



// <---------FIRST OCCURRENCE OF TARGET IN THE ARRAY BY BINARY SEARCH---------->

        int arr2[] = {1 , 6 ,6 , 6, 6 , 6 ,7, 8 , 9};
        System.out.println("The element " + 6 + " is first occurred at index : " + firstOccurenceBSearch(arr2 , 6));


// <---------LAST OCCURRENCE OF TARGET IN THE ARRAY BY BINARY SEARCH---------->

        int arr3[] = {1 , 6 ,6 , 6, 6 , 6 ,7, 8 , 9};
        System.out.println("The element " + 6 + " is last occurred at index : " + lastOccurenceBSearch(arr3 , 6));

// <---------LAST OCCURRENCE OF TARGET IN THE ARRAY BY BINARY SEARCH---------->

        int arr4[] = {1 , 6 ,6 , 6, 6 , 6 ,7, 8 , 9};
        System.out.println("The element " + 6 + " is total occurred for : " + totalOccurenceBSearch(arr4 , 6));






        
    }
}
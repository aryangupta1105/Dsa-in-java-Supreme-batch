import java.lang.*;
import java.util.*;

public class SortingNegativeElements{

    static void swap(int [] a , int i , int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void sortNegativetoLeft(int [] arr){
        int i = 0; 
        int j= arr.length -1;
        while(i<j){
            while(arr[i]< 0){
                i++;
            }
            while(arr[j]>=0){
                j--;
            }
            if(i<j){
                swap(arr , i , j);
            }
        }
    }
    static void sortNegativetoLeftM2(int [] arr){
        int i = 0; 
        int j = arr.length -1;
        int start = 0; 
        while(i<=j){
            if(arr[i] <0){
                swap(arr , i , start);
                start++;
                i++;
            }
            else if (arr[i]>= 0){
                swap(arr, i, j);
                j--;
            }
        }
        for(int x: arr)
        System.out.print(x+" ");
    }


    public static void main(String args[]){

// <-----------------------SORTING NEGATIVE ELEMENTS TO LEFT------------------->
        int arr[] = {-1 , 3, -2 , -1, -4, -32 , 42 , 43, 5, 2};
        sortNegativetoLeft(arr);
        for(int x: arr){
            System.out.print(x + " ");
        }


// <-----------------------SORTING NEGATIVE ELEMENTS TO LEFT------------------->
        int arr2[] = {-1 , 3, -6 , 34 ,2 , -2 , -1, -4, -32 , 42 , 43, 5, 2};
        System.out.println(" ");
        sortNegativetoLeftM2(arr2);
        System.out.println();


    }
}
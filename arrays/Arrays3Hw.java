import java.lang.*; 
import java.util.*;

public class Arrays3Hw{
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
    // abdul bari algo: 
    static void sort0s1s(int [] arr){
        int i = 0; 
        int j = arr.length -1;
        while(i<=j){
            while(arr[i] == 0){
                i++;
            }
            while(arr[j]==1){
                j--;
            }
            if(i<j){
                swap(arr , i , j);
            }
        }
    }
    static void sort0s1s2s(int [] a){
        int start = 0; 
        int i = 0;
        int end = a.length-1;
        while(start<=end){
            if(a[i]==0){
            swap(a,i , start);
            i++;
            start++;
            }
            if(a[i]==2){
            swap(a,i , end);
            end--;
            }
        }
    }
    public static void main(String args[]){

        int arr[] = {-1 , 3, -2 , 5, 2};
        sortNegativetoLeft(arr);
        for(int x: arr){
            System.out.print(x + " ");
        }
        System.out.println();
        int arr2[] = {1, 0 , 1,1, 0 , 1 ,0};
        sort0s1s(arr2);
        for(int x: arr2){
            System.out.print(x + " ");
        }
        int arr3[] = {1, 0 , 2,1, 2 , 1 ,0};
        sort0s1s(arr3);
        for(int x: arr3){
            System.out.print(x + " ");
        }
    }
}
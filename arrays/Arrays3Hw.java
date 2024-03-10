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
        System.out.print(" "+ x);
    }
    // Counting method for sorting 0s 1s and 2s:
    static void sort0s1s2s(int [] a){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i<a.length; i++ )
        {
            if(a[i] == 0) count0++;
            if(a[i] == 1) count1++;
            if(a[i] == 2) count2++;
        }
        for(int i = 0; i<count0; i++){
            a[i] = 0;
        }
        for(int i = 0; i<count1; i++){
            a[i+count0] = 1;
        }
        for(int i = 0; i<count2; i++){
            a[i+count1+count0] = 2;
        }
        for(int x:a){
            System.out.print(" "+x);
        }
    }
    // Method 2 for sorting 1 and 2 and 0s :
    static void sort0s1s2sM2(int [] a){
        int start = 0;
        int end = a.length -1;
        int i = 0;
        while(i<=end)
        {
            if(a[i] == 0){
                swap(a , i ,start);
                start++;
                i++;
            }
            else if(a[i] == 2){
                swap(a , i , end);
                end--;
            }
            else{
                i++;
            }
        }
        for(int x: a)
        System.out.print(x + " ");
    }
    // Leetcode 66: Plus one:
    // static int[] plusOne(int [] a){
    
    // }
    static int countNegatives(int[][] grid) {
        int count = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                if(grid[i][j]<0) count++;
            }
        }
        return count;
    }

    // merge sorted array:
    static void mergeSorted(int [] a , int [] b){
        int c[] = new int[a.length + b.length];
int i = 0, j = 0;
int k = 0;
while (i < a.length && j < b.length) {
    if (a[i] < b[j]) {
        c[k] = a[i];
        i++;
    } else {
        c[k] = b[j];
        j++;
    }
    k++;
}

// Copy remaining elements from array a
while (i < a.length) {
    c[k] = a[i];
    i++;
    k++;
}

// Copy remaining elements from array b
while (j < b.length) {
    c[k] = b[j];
    j++;
    k++;
}

for (int x : c)
    System.out.print(" " + x);

    }
    
    public static void main(String args[]){

        int arr[] = {-1 , 3, -2 , -1, -4, -32 , 42 , 43, 5, 2};
        sortNegativetoLeft(arr);
        // for(int x: arr){
        //     System.out.print(x + " ");
        // }
        sortNegativetoLeftM2(arr);
        // System.out.println();
        // int arr2[] = {1, 0 , 1,1, 0 , 1 ,0};
        // sort0s1s(arr2);
        // for(int x: arr2){
        //     System.out.print(x + " ");
        // }
        // int a[] = {1,3,5};
        // int b[] = {2,4,6};
        // int ar[][] = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        // System.out.println();
        // System.out.println(countNegatives(ar));

        // sort0s1s2s(a);

        // // My method: 
        System.out.println();
        // sort0s1s2sM2(a);
    //     for(int i = 0; i<a.length; i++)
    //    System.out.print( plusOne(a)[i]);

// merge Sorted arrays: 
        int a[] = {1,3,5};
        int b[] = {2,4,6};
        mergeSorted(a , b);
    }

}

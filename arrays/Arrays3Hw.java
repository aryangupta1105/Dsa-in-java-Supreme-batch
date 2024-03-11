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
    
    static int HASHduplicateNum(int [] arr){
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>=max) max = arr[i];
        }
        int c[] = new int[max+1];
        for(int i = 0; i<c.length; i++){
            c[arr[i]]++;
        }
        for(int i = 0; i<c.length; i++){
            if(c[i]>1) return i;
        }
        return -1;
    }

    static int negativeMarkingduplicate(int [] arr){
        int ans = -1;
        for(int i = 0; i<arr.length; i++){
            int index = Math.abs(arr[i]);
            if(arr[index] <0){
                ans = index;
                break;
            }

            arr[index] *= -1;
        }
        return ans;
    }

    static int PositioningDuplicate(int[] arr){
        while(arr[0] != arr[arr[0]]){
           swap(arr , 0 , arr[0]); 
        }
        return arr[0];
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

    static int firstRepeated(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]) max = arr[i];
        }
        int c[] = new int[max];
        for(int i = 0; i<c.length; i++){
            c[arr[i]]++;
        }
        for(int i = 0; i<arr.length; i++){
            if(c[arr[i]] > 1) return i+1;
        }
        return -1;
    }


    static int firstRepeating(int [] arr)
    {
        boolean flag = false;
        for(int i = 0 ;i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j])
                {
                    flag = true;
                    return i+1;
                }
            }
        }
        return -1;
    }

    static void CommonElement3Arrays(int [] a , int [] b , int [] c){
        int maxa = Integer.MIN_VALUE;
        int maxb = Integer.MIN_VALUE;
        int maxc = Integer.MIN_VALUE;
        for(int i = 0; i<a.length; i++){
            if(a[i] >= maxa) maxa = a[i];
        }
        for(int i = 0; i<b.length; i++){
            if(b[i] >= maxb) maxb = b[i];
        }
        for(int i = 0; i<c.length; i++){
            if(c[i] >= maxc) maxc = c[i];
        }
        int max;
        if(maxa>=maxb) {
            if(maxa >= maxc) max = maxa;
            else max = maxc;
        }
        else 
        {
            if(maxb>maxc) max = maxb;
            else max = maxc;
        }
        System.out.println(max);
        int d[] = new int[max+1];
        for(int i = 0; i<a.length; i++){
            d[a[i]]++;
        }
        for(int i = 0; i<b.length; i++){
            d[b[i]]++;
        }
        for(int i = 0; i<c.length; i++){
            d[c[i]]++;
        }
        for(int i = 0; i<d.length; i++){
            if(d[i] == 3)
            System.out.print(i+" ");
        }
    }
    public static void main(String args[]){
// <-----------------------SORTING NEGATIVE ELEMENTS TO LEFT------------------->
        // int arr[] = {-1 , 3, -2 , -1, -4, -32 , 42 , 43, 5, 2};
        // sortNegativetoLeft(arr);
        // for(int x: arr){
        //     System.out.print(x + " ");
        // }


// <-----------------------SORTING NEGATIVE ELEMENTS TO LEFT------------------->
        // sortNegativetoLeftM2(arr);
        // System.out.println();


// <-----------------------SORTING 0S 1S AND 2S ELEMENTS ------------------->

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

// <-----------------------SORTING 0S 1S AND 2S ELEMENTS M2------------------->
        
        // System.out.println();
        // sort0s1s2sM2(a);
    //     for(int i = 0; i<a.length; i++)
    //    System.out.print( plusOne(a)[i]);

// <-----------------------MERGING SORTED ARRAYS------------------->
// merge Sorted arrays: 
        // int a[] = {1,3,5};
        // int b[] = {2,4,6};
        // mergeSorted(a , b);


// <---------------------FINDING DUPLICATE NUMBER USING HASH------------------->
        // int a[] = {1, 2,3, 4, 6, 4, 5,  8 , 9, 7};
    //    int dup=  HASHduplicateNum(a);
    //     System.out.println(dup);


// <---------------------FINDING DUPLICATE NUMBER USING Traversing------------------->
    //    int dup2=  TraverseDuplicateNum(a);
    //     System.out.print(dup2);


// <---------------------FINDING DUPLICATE NUMBER USING NEGATIVEMARKING------------------->
    //    int dup2=  negativeMarkingduplicate(a);
    //     System.out.println(dup2);


// <---------------------FINDING DUPLICATE NUMBER USING POSITIONING------------------->
    //    int dup2=  PositioningDuplicate(a);
    //     System.out.println(dup2);

// <---------------------FINDING DUPLICATE NUMBER USING POSITIONING------------------->
    //     int a[] = {1,3,5,3,4};
    //    int missing=  FindMissingElementVisitingM(a);
    //     System.out.println(missing);


// <---------------------FINDING DUPLICATE NUMBER USING SORT AND SWAP------------------->
    //     int a[] = {1,2,4,4,4};
    //    swapNsortMissing(a);


// <---------------------FINDING FIRST REPEATED NUMBER ------------------->
        // int a[] = {1,5,3,4,3,5,6};
        // System.out.println(firstRepeating(a));


// <---------------------FINDING FIRST REPEATED NUMBER ------------------->
        // int a[] = {1,5,3,4,3,5,6};
        // System.out.println(firstRepeated(a));

// <---------------------FINDING COMMON ELEMENT IN THREE ARRAYS (MY METHOD)------------------->
    //     int a[] = {1,2 ,3,5,6,7};
    //     int b[] = {2,4,6,8,10};
    //     int c[] = {11,2,3,4,6};
    //    CommonElement3Arrays(a,b,c);

    
// <---------------------FINDING COMMON ELEMENT IN THREE ARRAYS ------------------->
    //     int a[] = {1,2 ,3,5,6,7};
    //     int b[] = {2,4,6,8,10};
    //     int c[] = {11,2,3,4,6};
    //    CommonElement3Arrays(a,b,c);



    }
}

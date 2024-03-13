import java.lang.*;
import java.util.*;

public class SortColors0s1s2s{
    static void swap(int [] a ,int i ,int j){
        int temp = a[i];
        a[i]= a[j];
        a[j] = temp;
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
            System.out.print(x+" ");
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
    public static void main(String args[])
    {


// <-----------------------SORTING 0S 1S AND 2S ELEMENTS ------------------->

        int a[] = {0,1,2,2 ,1 ,0 ,1 ,0 ,1,2};
        System.out.println("Counting Method: ");
        sort0s1s2s(a);

// <-----------------------SORTING 0S 1S AND 2S ELEMENTS M2------------------->
        
        int A[] = {0,1,2,2 ,1 , 0 , 2 , 1 ,0 ,1 ,0 ,1,2};
        System.out.println("\nTwo Pointer Approach: ");
        sort0s1s2sM2(A);

    }
}
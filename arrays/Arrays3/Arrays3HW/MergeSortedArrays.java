import java.lang.*;
import java.util.*;

public class MergeSortedArrays{
        // merge sorted array:
    static void mergeSorted(int [] a , int [] b)
    {
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

        System.out.print("The array is merged: " );
        for (int x : c)
            System.out.print( x + " ");

    }

    public static void main(String args[])
    {
    // <-----------------------MERGING SORTED ARRAYS------------------->
        // merge Sorted arrays: 
            int a[] = {1,3,5};
            int b[] = {2,4,6};
            mergeSorted( a, b);
    }
}
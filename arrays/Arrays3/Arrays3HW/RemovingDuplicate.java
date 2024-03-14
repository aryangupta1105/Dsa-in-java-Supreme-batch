import java.lang.*;
import java.util.*;

public class RemovingDuplicate{

    static int RemovingUsingHASHduplicateNum(int [] arr){
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>=max) max = arr[i];
        }
        int c[] = new int[max+1];
        for(int i = 0; i<c.length; i++){
            c[arr[i]]++;
        }
        int dup = -1;
        for(int i = 0; i<c.length; i++){
            if(c[i]>1) {
               dup = i;
            }
        }
        for(int i = 0; i<arr.length ; i++){
            if(arr[i] == dup){ 
                arr[i] = -1;
            }
        }
        for(int x: arr) System.out.print(x + " ");
        return dup;
    }
    public static void main(String args[]){
// <---------------------REMOVING DUPLICATE NUMBER USING HASH------------------->

        int ar[] = {1, 2,3, 4, 6, 4, 5,  8 , 9, 7};
        int dup5 =  RemovingUsingHASHduplicateNum(ar);
        System.out.println("\nThe duplicate element is: " + dup5);

    }
}
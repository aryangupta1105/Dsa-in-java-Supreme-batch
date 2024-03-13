import java.lang.*;
import java.util.*;

public class FirstRepeated{

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
    public static void main(String args[]){

// <---------------------FINDING FIRST REPEATED NUMBER ------------------->
        // int a[] = {1,5,3,4,3,5,6};
        // System.out.println(firstRepeating(a));


// <---------------------FINDING FIRST REPEATED NUMBER ------------------->
        int a[] = {1,5,3,4,3,5,6};
        System.out.println("The first repeated element is at Index: " + firstRepeated(a));




    }
}
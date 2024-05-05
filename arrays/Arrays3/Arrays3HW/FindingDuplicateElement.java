
import java.util.*;

public class FindingDuplicateElement{


    static void swap(int [] a , int i , int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
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



    public static void main(String args[]){
// <---------------------FINDING DUPLICATE NUMBER USING HASH------------------->
    int a[] = {1, 2,3, 4, 6, 4, 5,  8 , 9, 7};
       int dup=  HASHduplicateNum(a);
        System.out.println(dup);

// <---------------------FINDING DUPLICATE NUMBER USING NEGATIVEMARKING------------------->

       int dup3=  negativeMarkingduplicate(a);
        System.out.println(dup3);

// <---------------------FINDING DUPLICATE NUMBER USING POSITIONING------------------->
        
        int ar[] = {1, 2,3, 4, 6, 4, 5,  8 , 9, 7};
        int dup4=  PositioningDuplicate(ar);
        System.out.println(dup4);
        for(int x: ar) System.out.print(x + " ");


    }
}
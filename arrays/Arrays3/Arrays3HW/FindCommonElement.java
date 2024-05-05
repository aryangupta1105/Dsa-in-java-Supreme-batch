
import java.util.*;

public class FindCommonElement{
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


//  only for sorted arrays:

    static Set<Integer> CommonElement3ArraysM2(int[] a, int[] b, int[] c){
        int i = 0;
        int j= 0; int k = 0;
        Set<Integer> st =  new HashSet<>();
        // Vector<Integer> ans = new Vector<>();
        System.out.print(a.length + " " + b.length + " " + c.length);
       while (i < a.length && j < b.length && k < c.length)
        {
            if(a[i] == b[j] && b[j] == c[k])
            {
                // if(!ans.contains(a[i]))
                // or use set
                st.add(a[i]);
                // ans.add(a[i]);
                i++; k++; j++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else if(b[j] < c[k]){
                j++;
            }
            else {
                k++;
            }
        }
            return st;
    }


    //  removing duplicates from an array:
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



// <---------------------FINDING COMMON ELEMENT IN THREE ARRAYS ------------------->
        
        // int a[] = {1,2 ,3,5,6,6};
        // int b[] = {2,4,6,6,10};
        // int c[] = {2 ,3,4 ,6 , 6};
        int a[] = {6,6,6};
        int b[] = {6,6,6};
        int c[] = {6, 6 , 6};
        
        // Vector<Integer> result = CommonElement3ArraysM2(a, b, c);
        // System.out.println(result);
        // Note:= In set we doesn't need to check the duplicates, It by itself doesn't include duplicates....

        Set<Integer> result = CommonElement3ArraysM2(a, b, c);
        System.out.println("\n" + result);

    }
}
import java.lang.*;
import java.util.*;

public class FactorialLargeNumber{
    static Vector<Integer> plusOne(int [] arr){
        int carry = 0;
        Vector<Integer> ans = new Vector<>();
        int i = arr.length-1;
            int x = arr[i] +  1 + carry;
            int digit = x%10;
            ans.add(digit);
            carry = x/10;
        return ans;
    }
    public static void main(String args[]){
        int a[] = {1 , 2, 5};
        System.out.print(plusOne(a));
    }
}
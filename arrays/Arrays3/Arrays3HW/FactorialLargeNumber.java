import java.lang.*;
import java.util.*;

public class FactorialLargeNumber{
    static String addTwoArrays(int arr1[] , int arr2[] , int m , int n){
        int i = m-1;
        int j = n-1;
        int carry = 0;
        StringBuilder answ = new StringBuilder();
        Vector<Integer> ans = new Vector<>();
        int x = 0;
        while(i>=0 && j>=0){
            x = arr1[i] + carry + arr2[j];
            int digit = x % 10;
            ans.add(digit);
            carry = x / 10;
            i--; j--;
        }
        while(i>=0){
            x = carry + 0 + arr1[i];
            int digit = x % 10;
            ans.add(digit);
            carry = x / 10;
            i--;
        }
        while(j>=0){
            x = carry + 0 + arr2[j];
            int digit = x % 10;
            ans.add(digit);
            carry = x / 10;
            j--;
        }
        if(carry!=0){
            ans.add(carry);
        }
        StringBuilder answer = new StringBuilder();
        for(int k = ans.size()-1; k>=0; k--){
            answer.append(ans.get(k));
        }
       
        String result = answer.toString();
        return result;
    }
    public static void main(String args[]){
        int a[] = {1 , 2, 5 , 5 , 2};
        int b[] = {2 , 5, 3 ,2 ,1 ,2};
        String result = addTwoArrays(a, b, a.length , b.length);
        System.out.print(result);
    }
}
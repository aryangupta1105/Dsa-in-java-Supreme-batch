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

    static String LargeFactorial(int n ){
        
        Vector<Integer> ans = new Vector<>();
        ans.add(1);
        int carry = 0;
        for(int i = 2; i<=n; i++){
           for(int j = 0; j<ans.size(); j++) {
                int x = ans.get(j) * i + carry;
                ans.set(j , x%10);
                carry = x / 10;
           }
           while(carry != 0){
            ans.add(carry%10);
            carry /= 10;
           }
           carry = 0;
        }
        Vector<Integer> result = new Vector<>();
        StringBuilder answer = new StringBuilder();
        for(int k = ans.size()-1; k>=0; k--){
            result.add(ans.get(k));
            answer.append(ans.get(k));
        }
        String result1 = answer.toString();
        return result1;
    }
  
    
    public static void main(String args[]){
    // <--------------------ADDITION OF TWO ARRAYS ----------------------->
        // int a[] = {1 , 2, 5 , 5 , 2};
        // int b[] = {1};
        // String result = addTwoArrays(a, b, a.length , b.length);
        // System.out.print(result);

    // <--------------------FACTORIAL OF ANY LARGE NUMBER----------------------->
        // System.out.print(LargeFactorial(999));



    }
}
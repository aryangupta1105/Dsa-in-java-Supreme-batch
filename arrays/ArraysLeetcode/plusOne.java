

public class PlusOne{
    
    static int[] plusOne(int arr[]){
        int i = arr.length - 1;
        int carry = 0;
        String ans = "";
        int digit = 0;
        
            int x = arr[i] + carry + 1;
            digit = x % 10;
            ans += digit;
            carry = x / 10;
            i--; 
        while(i>=0){
            x = arr[i] + carry + 0;
            digit = x % 10;
            ans += digit;
            carry = x / 10;
            i--;
        }
        if(carry!=0){
            x =carry + 0;
            digit = x % 10;
            ans += digit;
            carry = x / 10;
        }
        int[] intArray = new int[ans.length()];
    
    // Step 2: Reverse the string and add each character to the array as an integer
    for (int k = ans.length() - 1, j = 0; k >= 0; k--, j++) {
        intArray[j] = Character.getNumericValue(ans.charAt(k));
    }
    return intArray;
    }
    public static void main(String args[]){
        int arr[] = {1 , 2, 4, 5};
        int result[] = plusOne(arr);
        for(int num:result) System.out.print(num + " ");
    }
}
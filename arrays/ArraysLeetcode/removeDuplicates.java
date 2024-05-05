
import java.util.*;

public class RemoveDuplicates{
      static int[] removeDuplicates(int[] nums) {
        int max = Integer.MIN_VALUE;
    for (int num : nums) {
        if (num > max) {
            max = num;
        }
    }
    
    // Step 2: Count occurrences of each number
    int[] counts = new int[max + 1];
    for (int num : nums) {
        counts[num]++;
    }
    
    // Step 3: Count the number of unique elements
    int uniqueCount = 0;
    for (int count : counts) {
        if (count > 0) {
            uniqueCount++;
        }
    }
    
    // Step 4: Build the array of unique elements
    int[] uniqueElements = new int[uniqueCount];
    int index = 0;
    for (int i = 0; i < counts.length; i++) {
        if (counts[i] > 0) {
            uniqueElements[index++] = i;
        }
    }
    
    return uniqueElements;
}
    public static void main(String args[]){
        int arr[] = {1 , 2, 4 , 4 , 5 ,3 ,2, 5};
        int result[] = removeDuplicates(arr);
        for(int num:result) System.out.print(num + " ");
    }
}
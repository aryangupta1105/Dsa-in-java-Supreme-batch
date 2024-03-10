import java.lang.*;
import java.util.*;
public class testLeetcode {
    static int removeElement(int[] nums, int val) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != val) {
            nums[count] = nums[i];
            count++;
        }
    }
    while (count < nums.length) {
        nums[count] = 0;
        count++;
    }
    for (int x : nums) {
        System.out.print(" " + x);
        if(x == 0){
            count = count -1;
        }
    }
    return count;
}
// time complexity o(n^2):
static List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int low = i + 1, high = n - 1, target = -nums[i];
                while (low < high) {
                    if (nums[low] + nums[high] +nums[i] == 0) {
                        resultList.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while (low < high && nums[low] == nums[low + 1]) low++;
                        while (low < high && nums[high] == nums[high - 1]) high--;
                        low++;
                        high--;
                    } else if (nums[low] + nums[high] < target) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }
        return resultList;
    
    }
    static List<List<Integer>> foursum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                for (int j = i + 1; j < n - 2; j++) {
                    if (j == i + 1 || (j > i + 1 && nums[j] != nums[j - 1])) {
                        int low = j + 1, high = n - 1;
                        while (low < high) {
                            int sum = nums[i] + nums[j] + nums[low] + nums[high];
                            if (sum == 0) {
                                resultList.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                                while (low < high && nums[low] == nums[low + 1]) low++;
                                while (low < high && nums[high] == nums[high - 1]) high--;
                                low++;
                                high--;
                            } else if (sum < 0) {
                                low++;
                            } else {
                                high--;
                            }
                        }
                    }
                }
            }
        }
        return resultList;
    
    }
static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arrList = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                for(int k = j+1; k<nums.length; k++){
                    
                        if(nums[i] + nums[j] + nums[k] == 0)
                            {
                                if(i!=j && j!=k && k!=i){
                                
                                
                            List<Integer> dataList = new ArrayList<>();
                            dataList.add(nums[i]);
                            dataList.add(nums[j]);
                            dataList.add(nums[k]);
                            if(!arrList.contains(dataList))
                            arrList.add(dataList);
                            }
                            
                            }
                }
            }
        }
        return arrList;
    }
    

    
    static int removeDuplicates(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (max < num) max = num;
        }
        int[] c = new int[max + 1]; // Adjust the size of c

        for (int num : nums) {
            c[num]++;
        }

        int count = 0;
        for (int value : c) {
            if (value > 1) count += value - 1; // Increment count by the frequency minus 1
        }

        return count;
    }

// Leet code questions:
    // Search insert position
    static int searchPosition(int [] nums , int target){
        int low = 0 , high = nums.length-1; 
        int mid = (low+high)/2;
        while(low<high)
        {
            if(nums[mid] > target){
                high = mid -1; 
                mid = (low + high )/2;
            }
            else if(nums[mid] < target){
                low = mid +1 ; 
                mid = (low + high )/2;
            }
            else{
                return mid;
            }
        }
        return mid+1;
    }

// question number: 
    static int number(int [] nums){
        int i = 0 , j = nums.length;
        while(i<=j){
            if(nums[i] == nums[j])
            {
                i = i+1;
                j=nums.length;
            }
            else{
                
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        // System.out.println(removeDuplicates(nums));
        // // System.out.println(removeElement(nums , 5));
        // System.out.println(threeSum2(nums));
        // System.out.println(foursum(nums));

        // System.out.println(searchPosition(nums , 11));
        System.out.println(number(nums));

        


        
    }
}

    
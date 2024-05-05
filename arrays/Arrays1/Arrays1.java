
import java.util.*;

public class Arrays1{

    static void ArrayChange(int [] arr){
        for(int i = 0; i<arr.length; i++){
            arr[i] += 2;
            System.out.print(arr[i] + " ");
        }
    }
    static int linearSearch(int [] a , int key){
        for(int i = 0; i<a.length; i++){
            if(a[i] == key){
                return i;
            }
        }
        return -1;
    }
    static int findCount(int [] a , int numZero , int numOne , int numTwo , int numThree){
        for(int i = 0; i<a.length; i++){
            if(a[i] == 0) numZero++;
            if(a[i] == 1) numOne++;
            if(a[i] == 3) numThree++;
            if(a[i] == 2) numTwo++;
        }
        System.out.printf(" 1: %d\n 2: %d\n 3: %d\n 0: %d \n" , numOne , numTwo , numThree , numZero);
        return 0;
    }

    static int findMax(int arr[]){
        int max= Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(max<=arr[i]) max = arr[i];
        }
        return max;
    }
    static int findMin(int arr[]){
        int min= Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(min>=arr[i]) min = arr[i];
        }
        return min;
    }

    static void swap(int arr[] , int i , int j)
    {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    static void swap2(int arr[] , int i , int j)
    {
      arr[i] = (arr[i] + arr[j] + arr[j] - arr[i])/2
      arr[j] = (arr[i] + arr[j] - (arr[j] - arr[i]))/2
    }

    public static void main(String args[])
    {
        System.out.println("hello world");

        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 3, 5, 7 , 9};

        // Iterating through array:
        // Method 1:
        for(int x:arr){
            System.out.println(x);
        }
        // Method 2:
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }


        // Taking input from user:
        // System.out.print("Enter the size of Array: ");
        // int n = sc.nextInt();
        // int arr2 [] = new int[n];
        // for(int i = 0 ; i<arr2.length; i++){
        // System.out.print("Enter the element "+ i + " of Array: ");
        //     arr2[i] = sc.nextInt();
        // }
        // // printing their doubles:
        // System.out.println("printing their doubles:");
        // for(int i = 0; i<arr2.length; i++){
        //     System.out.println(arr2[i]*2);
        // }

        // System.out.println("changing values to 1:");
        // for(int i = 0 ; i<arr2.length; i++){
        //     arr2[i] = 1;
        //     System.out.println(arr2[i]);
        // }

        // Memset Function: It is used to initialize the complete array with any data:  
        int arr3[] = new int[10];
        // Memset(arr3, 1 , arr3+10); it is only available in c and cpp:


        // For java : array.fill()

        Arrays.fill(arr3, 2);
            for(int x:arr3){
                System.out.println(x);
            }



        // Arrays and function : The arrays are always passed as refrence in the function:......
        int Arr[] = {1, 5, 6, 8, 10};

        System.out.print(" passing array in the ArrayChange function:   ");
        ArrayChange(Arr);

        System.out.println("\nAfter passing array:   ");
        for(int i = 0 ; i<Arr.length; i++)
        {
            System.out.print(Arr[i] + " ");
         }


        //  Linear Search in Array: 
        int key; 
        System.out.println("\nEnter the key to find: ");
        key = sc.nextInt();
        int lArr [] = {2, 4, 23 , 53 , 3, 69 , 34};
        
        System.out.printf("The %d is at index %d" , key , linearSearch(lArr , key));
        //  Count Search in Array: 
        
        int lArr2 [] = {2,2,1,1,1,0,3,0,0,0,0};
        int numZero = 0;
        int numOne = 0;
        int numTwo = 0;
        int numThree = 0;
        System.out.println("\nCounting elements of an Array: ");
        findCount(lArr2 , numZero , numOne , numTwo , numThree);
        

        // Searching Max element in an array:
        int MArr[] = {-3,34,32 ,  65,23};
        System.out.println(findMax(MArr));


        // Searching min element in an array:
        System.out.println(findMin(MArr));


        // Extreme print in Array means first and last element printing in array:
        int ExtArray[] ={-3,34,32 , 43, 65,23};
        for(int i = 0 , j = ExtArray.length-1 ; i<j; i++ , j--){
            if(i==j)
            System.out.print(ExtArray[i]+ " ");
            else
            System.out.print(ExtArray[i]+ " " + ExtArray[j] + " ");
        }

        System.out.println("\nReversing an Array O(n) using swapping:");
        //Reversing an array:
        int ExtArray2[] ={-3,34,32 , 43, 65,23};
        for(int i = 0 , j = ExtArray2.length-1 ; i<j; i++ , j--){
            swap(ExtArray2 , i , j);
        }
        for(int x:ExtArray2){
            System.out.println(x);
        }


        System.out.println("\nReversing an Array O(n) using swapping2:");
        //Reversing an array:

        
    }
}
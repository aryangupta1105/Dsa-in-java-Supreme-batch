
import java.util.*; 

public class Arrays3{

    static void rotateArrayRight(Vector<Integer> a){
        
        int temp = a.get(a.size()-1);
        for(int i = a.size()-1; i>0; i--){
            a.set(i , a.get(i-1));
        }
        a.set(0, temp);
    }

    // static void swap2(int []a , int i , int j){
    //     int temp = a[i];
    //     a[i] = a[j]; 
    //     a[j] = temp;
    // }
    // //Function to rotate an array by d elements in counter-clockwise direction. 
    // static void rotateArr(int a[], int d , int n)
    // {
    //     for(int i = n-1 ; i>=0; i--){
    //         if(i-d<0){
    //             int newIndex = i-d + n;
    //             swap2(a , i , newIndex);
    //         }
    //         else{
    //             swap2(a , i , i-d);
    //         }
    //     }
    // }

    // <----------This is the main part which is wrong---------------->
    // int n = 5;
    //     int aN[] = new int[n];
    //     for(int i = 0; i<n; i++){
    //         aN[i] = i+1;
    //     }
    //     System.out.println("Original Array:");
    //     for(int x: aN) 
    //     rotateArr(aN , 3 , n);
    //     System.out.println("\nLeft rotated Array:");
    //     for(int x: aN)
    //     System.out.print(x + " ");
    // <----------This is the main part which is wrong---------------->

    static void rotateArrayLeft(Vector<Integer> a ){
        
        int temp = a.get(0);
        for(int i = 0; i<a.size()-1; i++){
            a.set(i , a.get(i+1));
        }
        a.set(a.size()-1 , temp);
    }

    static void NrotateArrayLeft(Vector<Integer> a , int n){
        
        while(n>0){
            int temp = a.get(0);
        for(int i = 0; i<a.size()-1; i++){
            a.set(i , a.get(i+1));
        }
        a.set(a.size()-1 , temp);
         n--;
        }
    }
    static void swap(int[][] a , int i , int j)
    {
        int temp = a[i][j];
        a[i][j] = a[j][i];
        a[j][i] = temp;
    }
    static void LinearSearch2dArray(int [][] a , int key , int r , int c){
        for(int i = 0; i<r; i++){
            for(int j = 0 ;j<c; j++){
                if(key == a[i][j])
                {
                    System.out.printf("%d is present at [%d, %d]",key,  i ,j);
                }
            }
        }
    }
    static int Max2dArray(int [][] a , int r , int c){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<r; i++){
            for(int j = 0 ;j<c; j++){
                if(max <= a[i][j])
                {
                   max = a[i][j];
                }
            }
        }
        return max;
    }
   static int Min2dArray(int [][] a , int r , int c){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<r; i++){
            for(int j = 0 ;j<c; j++){
                if(min >= a[i][j])
                {
                   min = a[i][j];
                }
            }
        }
        return min;
    }
    static void Transpose2dArray(int[][] a , int r , int c , int Transpose[][]){
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                Transpose[i][j] = a[j][i];
            }
                System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

// <----------------------------Left Rotation by 1 element in Arrays---------------------------->
        //  Vector<Integer> a = new Vector<>(5);
        // for(int i = 0; i<a.capacity(); i++){
        //     a.add(i+1);
        // }
        // System.out.println("Original Array:");
        // System.out.println(a);
        // System.out.println("Left rotated Array:");
        // rotateArrayLeft(a);
        // System.out.println(a);
// <----------------------------Left Rotation by n element in Arrays---------------------------->
        //  Vector<Integer> aN = new Vector<>(5);
        // for(int i = 0; i<aN.capacity(); i++){
        //     aN.add(i+1);
        // }
        // System.out.println("Original Array:");
        // System.out.println(aN);
        // System.out.println("Left rotated Array:");
        // NrotateArrayLeft(aN , 3);
        // System.out.println(aN);
// <----------------------------Left Rotation by n element in Arrays---------------------------->
        
        //  Vector<Integer> a = new Vector<>(5);
        // for(int i = 0; i<a.capacity(); i++){
        //     a.add(i+1);
        // }
        // System.out.println("Original Array:");
        // System.out.println(a);
        // System.out.println("Right rotated Array:");
        // rotateArrayRight(a);
        // System.out.println(a);

// <----------------------------2d Arrays---------------------------->
        // int arr2[][] = new int[3][3];
        int arr2[][] = {{1,2,3} , {4,5,6} , {7,8,9}};
// <----------------------------Creating 2d Arrays---------------------------->
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
// <----------------------------Modifying by userInput in 2d Arrays---------------------------->
        // for(int i = 0; i<3; i++)
        // {
        //     for(int j = 0; j<3; j++){
        //         System.out.printf("Enter the value of [%d][%d] element: " , i ,j);
        //         arr2[i][j] = sc.nextInt();
        //     }
        //     System.out.println();
        // }
// <----------------------------Row wise Accessing elements in 2d Arrays---------------------------->
            System.out.println("Accessing Row wise:");
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
// <----------------------------Column wise Accessing elements in 2d Arrays---------------------------->
            System.out.println("Accessing Column wise:");
            for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++){
                System.out.print(arr2[j][i] + " ");
            }
            System.out.println();
        }
// <----------------------------Row wise Sum  elements in 2d Arrays---------------------------->
            System.out.println("Sum Row wise:");
            int sum = 0;
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++){
                sum += arr2[i][j];
            }
            System.out.print("Row " + (i+1 )+ " sum : " + sum+ " ");
            System.out.println();
        }
// <----------------------------Column wise Sum  elements in 2d Arrays---------------------------->
            System.out.println("\nSum Column wise:");
            int sumColumn = 0;
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++){
                sumColumn += arr2[j][i];
            }
            System.out.print("Column " + (i+1 )+ " sum : " + sumColumn+ " ");
            System.out.println();
        }
// <----------------------------Linear Search in 2d Arrays---------------------------->
        System.out.println("Linear Search in 2d Array:");
        LinearSearch2dArray(arr2 , 3 , 3, 3);
        
// <----------------------------Max Element in 2d Arrays---------------------------->
        System.out.print("\nThe max element in 2d array: " + Max2dArray(arr2 , 3 ,3));

// <----------------------------Min Element in 2d Arrays---------------------------->
        System.out.println("\nThe min element in 2d array: " + Min2dArray(arr2 , 3 ,3));
        
// <----------------------------Transpose in 2d Arrays---------------------------->
        int Transpose[][] = new int[3][3]; 
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
       Transpose2dArray(arr2,3, 3 ,Transpose);

        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++){
                System.out.print(Transpose[i][j] + " ");
            }
            System.out.println();
        }

// <----------------------------2d Vectors---------------------------->

        Vector<Vector<Integer>> arr= new Vector<>();

        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);

        Vector<Integer> vector2 = new Vector<>();
        vector2.add(4);
        vector2.add(5);
        vector2.add(6);


        Vector<Integer> vector3 = new Vector<>();
        vector3.add(7);
        vector3.add(8);
        vector3.add(9);
        vector3.add(10);


// <----------------------------Creating a 2d Vectors---------------------------->
        arr.add(vector);
        arr.add(vector2);
        arr.add(vector3);


        System.out.println(arr);
// <----------------------------Accessing a 2d Vectors---------------------------->

        // only in case of same number of column size:
        System.out.println("Accessing 2d Vector same column size:");
        for(int i = 0; i<arr.size(); i++)
        {
            for(int j =0; j<arr.get(0).size(); j++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }

        // in case of different column size:
         System.out.println("Accessing 2d Vector different column size:");
        for(int i = 0; i<arr.size(); i++)
        {
            for(int j =0; j<arr.get(i).size(); j++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }







    }
}
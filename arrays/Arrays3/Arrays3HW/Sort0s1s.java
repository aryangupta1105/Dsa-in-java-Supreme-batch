

public class Sort0s1s{
    static void swap(int [] a ,int i ,int j){
        int temp = a[i];
        a[i]= a[j];
        a[j] = temp;
    }
    // abdul bari algo: 
    static void sort0s1s(int [] arr){
        int i = 0; 
        int j = arr.length -1;
        while(i<=j){
            while(arr[i] == 0){
                i++;
            }
            while(arr[j]==1){
                j--;
            }
            if(i<j){
                swap(arr , i , j);
            }
        }
    }
    static void sort0s1sM2(int [] a){
        int count0 = 0;
        int count1 = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i] == 0 ) count0++;
            if(a[i] == 1 ) count1++;
        }

        for(int i = 0; i<count0; i++){
            a[i] = 0;
        }
        for(int i = 0; i<count1; i++){
            a[i] = 1;
        }

        for(int x: a) System.out.print(x + " ");
    }
    public static void main(String args[])
    {
        
// <-----------------------SORTING 0S 1S AND 2S ELEMENTS ------------------->

        // int arr2[] = {1, 0 , 1,1, 0 , 1 ,0};
        // sort0s1s(arr2);
        // for(int x: arr2){
        //     System.out.print(x + " ");
        // }
        // int a[] = {1,3,5};
        // int b[] = {2,4,6};





// <-----------------------SORTING 0S 1S AND 2S ELEMENTS M2------------------->
        
        // System.out.println();
        // sort0s1s2sM2(a);
    //     for(int i = 0; i<a.length; i++)
    //    System.out.print( plusOne(a)[i]);

    }
}
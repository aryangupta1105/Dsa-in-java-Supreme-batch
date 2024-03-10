import java.lang.*;
import java.util.*;

public class Arrays2Test{

// The find Unique Element Method(the array list and size of arrayList)-------->
    static int FindUniqueElement(Vector<Integer> a , int size){
        int ans = 0;
        for(int i = 0; i<size; i++){
            // we xor the element first with 0 then with each element:
            ans = ans ^ a.get(i);
        }
        return ans;
    }


    static int MyFindUniqueElement(){
        Scanner sc = new Scanner(System.in);
         int arr[] = new int[5];
        for(int i = 0; i<5; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int i = 0; i<5; i++){
            if(max <= arr[i])  max = arr[i];
        }
        int [] b = new int[max];
        for(int i = 0; i<max; i++){
            b[arr[i]] += 1;
        }
        for(int i = 0; i<max; i++){
            if(b[i] == 1){
                return i;
            }
        }
        return -1;
    }


    static void UnionArray(Vector<Integer> a , Vector<Integer> b){
        Vector<Integer> c = new Vector<>(a.size() + b.size());
        for(int i = 0; i<c.capacity(); i++){
           if(i< a.size())
            c.add(a.get(i));
           else
            c.add(b.get(i - a.size()));
        }
        System.out.println(c);
    }
    static void UnionArrayNoDuplicates2(Vector<Integer> a , Vector<Integer> b){
        Vector<Integer> c = new Vector<>(a.size() + b.size());
        for(int i = 0; i<a.size(); i++){
            for(int j = 0; j<b.size(); j++)
            {
                if(a.get(i) == b.get(j)){
                    b.add(j , -1);
                }
            }
        }
        for(int i = 0; i<a.size(); i++){
            c.add(a.get(i));
        }
        for(int i = 0; i<b.size(); i++){
            if(b.get(i) != -1)
            c.add(b.get(i));
        }
        System.out.println(c);
    }
    static void UnionArrayNoDuplicates(Vector<Integer> a , Vector<Integer> b){
        Vector<Integer> c = new Vector<>(a.size() + b.size());
        
        for(int i = 0; i<a.size(); i++)
            c.add(a.get(i));

        for(int i = 0; i<a.size(); i++)
            {
                for(int j = 0; j<b.size(); j++)
                {
                    if(a.get(i) == b.get(j))
                    {
                        b.remove(j);
                    }
                }
            }
            for(int i = 0; i<b.size(); i++)
            {
                c.add(b.get(i));
            }

        System.out.println(c);
    }

    static void IntersectionArray(Vector<Integer> a , Vector<Integer> b)
    {
        Vector<Integer> c = new Vector<>();
        for(int i = 0; i<a.size(); i++ )
        {
            for(int j = 0; j<a.size(); j++)
            {
                if(a.get(i) == b.get(j)) {
                     c.add(b.get(j));
                     b.add(j , -1); 
                     break;
                }
            }
        }
        System.out.println(c);

    }


    static void PairSum(Vector<Integer> a){
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size(); j++) {
                if (a.get(j) + a.get(i) == 8) {
                     System.out.printf("(%d , %d)\n" , a.get(j) , a.get(i));       
                }
            }
        }
    }

    static void TripletSum(Vector<Integer> a){
        for (int i = 0; i < a.size(); i++) {
            for (int j = i+1; j < a.size(); j++) {
                for(int k = j+1; k<a.size(); k++)
                {
                    if(a.get(i) + a.get(j) + a.get(k) == 9){
                        System.out.printf("(%d, %d, %d)\n" , a.get(i) , a.get(j) , a.get(k));
                    }
                }
                }
            }
        }
    
    static void FourSum(Vector<Integer> a)
    {
        for (int i = 0; i < a.size(); i++) {
            for (int j = i+1; j < a.size(); j++) {
                for(int k = j+1; k<a.size(); k++)
                {
                    for(int p = k+1; p<a.size(); p++)
                    {
                    if(a.get(i) + a.get(j) + a.get(k) + a.get(p) == 13){
                            System.out.printf("(%d, %d, %d,%d)\n" , a.get(i) , a.get(j) , a.get(k) , a.get(p));
                        }
                    }
                }
            }
        }
    }

    static void swap(Vector<Integer> a , int i , int j)
    {
        
        int temp = a.get(i);
        a.set(i , a.get(j));
        a.set(j , temp);
    }
    

    static void Sort0s1s(Vector<Integer> a){
       int start = 0; 
       int i = 0; 
       int end = a.size() -1;
       while(start <= end){
        if(a.get(i) == 0)
        {
            swap(a , i , start);
            start++;
            i++;
        }
        if(a.get(i) == 1 )
        {
            swap(a, i , end);
            end--;
        }
    
       }
        System.out.print(a);
       
    }

        

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


// <--------------------UNIQUE ELEMENT IN ARRAY QUESTION----------------------->

    // System.out.println("Enter the size of Array: ");
    // int n = sc.nextInt(); 
    // Vector<Integer> a = new Vector<>(n);
    // for(int i = 0; i<n; i++)
    // {
    //     a.add(sc.nextInt());
    // }

    //     int uniqueElement = FindUniqueElement(a , n);

    //     System.out.println("The unique element in the array is : " + uniqueElement);

       
    //     System.out.println("By My Method: The unique element in array : " +  MyFindUniqueElement());

// <--------------------UNION OF ARRAY QUESTION----------------------->
        // Vector<Integer> a = new Vector<>(5);
        // Vector<Integer> b = new Vector<>(5);
        // for(int i = 0; i<5; i++)
        // {
        //     a.add(i+10);
        //     b.add(i+20);
        // }
        // a.add(3,21);
        // b.add(3,21);
        // a.add(4,24);
        // b.add(4,24);
        // System.out.println(a);
        // System.out.println(b);
        // UnionArray(a,b);

// <--------------------INTERSECTION OF ARRAY QUESTION----------------------->
        // for(int i = 0; i<5; i++)
        // {
        //     a.add(i+10);
        //     b.add(i+20);
        // }
        // b.add(3 , 35);
        // b.add(4 , 34);
        // b.add(5 , 35);
        // b.add(6 , 34);
        // a.add(3 , 35);
        // a.add(4 , 34);
        // System.out.println(a);
        // System.out.println(b);
        // IntersectionArray(a,b);


// <--------------------UNION OF ARRAY WITH DUPLICATES QUESTION----------------------->
        // Vector<Integer> a = new Vector<>(5);
        // Vector<Integer> b = new Vector<>(5);
        // for(int i = 0; i<5; i++)
        // {
        //     a.add(i+10);
        //     b.add(i+20);
        // }
        // a.add(3,21);
        // b.add(3,21);
        // a.add(4,24);
        // b.add(4,24);
        // System.out.println(a);
        // System.out.println(b);
        // UnionArrayNoDuplicates(a,b);
    
// <--------------------UNION OF ARRAY WITH DUPLICATES 2 QUESTION----------------------->
        // Vector<Integer> a = new Vector<>(5);
        // Vector<Integer> b = new Vector<>(5);
        // for(int i = 0; i<5; i++)
        // {
        //     a.add(i+10);
        //     b.add(i+20);
        // }
        // a.add(3,21);
        // b.add(3,21);
        // a.add(4,24);
        // b.add(4,24);
        // System.out.println(a);
        // System.out.println(b);
        // UnionArrayNoDuplicates2(a,b);

// There is doubt in this one HomeWork:


// <----------------------------PAIR SUM QUESTION--------------------------->
        // Vector<Integer> a = new Vector<>(5);
        // Vector<Integer> b = new Vector<>(5);
        // for(int i = 1; i<=9 ; i = i+1)
        // {
        //     a.add(i);
        // }
        // System.out.println(a.size());
        // System.out.println(b.size());
        // // PairSum(a);
        // TripletSum(a);




// <----------------------------TRIPLET SUM QUESTION--------------------------->
        // Vector<Integer> a = new Vector<>(5);
        // Vector<Integer> b = new Vector<>(5);
        // for(int i = 1; i<=9 ; i = i+1)
        // {
        //     a.add(i);
        // }
        // System.out.println(a.size());
        // System.out.println(b.size());
        // TripletSum(a);
        

// <----------------------------FOUR SUM QUESTION--------------------------->
        // Vector<Integer> a = new Vector<>(5);
        // Vector<Integer> b = new Vector<>(5);
        // for(int i = 1; i<=9 ; i = i+1)
        // {
        //     a.add(i);
        // }
        // System.out.println(a.size());
        // System.out.println(b.size());
        // FourSum(a);
        

// <----------------------------SORT 0'S AND 1'S QUESTION------------------->

        Vector<Integer> a = new Vector<>(10);

        for(int i = 0 ; i<a.capacity(); i++){
            if(i%2 == 0) 
            a.add(0);
            else a.add(1);
        }
        a.add(3,0);
        a.add(4,0);
        a.add(5,0);
        System.out.println(a);
        Sort0s1s(a);
    }

}
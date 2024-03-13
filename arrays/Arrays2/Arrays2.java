import java.lang.*;
import java.util.*;
import java.util.Vector;
import java.util.ArrayList;

public class Arrays2{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> arr = new Vector<>();
        // Add method to add element in vector:
        System.out.println(arr + " " + arr.capacity());

        // To add element:
        for(int i = 0; i<10; i++)
        {
        arr.add(23);
        }
        System.out.println(arr + " " + arr.capacity());
        // To add at any index:
        arr.add(3, 25);
        // Returns capacity();
        System.out.println(arr + " " + arr.capacity());

        // elementAt(): returns the component at any index:
        System.out.println(arr.elementAt(3));

        // Returns the elements: 
        System.out.println("the array elements are at " + arr.elements());


        Vector<Integer> arr2 = new Vector<>();
        for(int i = 0; i<10; i++)
        {
        arr2.add(23);
        }
        System.out.println(arr2 + " " + arr2.capacity());
        arr2.add(3, 25);


        // To compare two objects:
        System.out.println( arr.equals(arr2));     //Compares all the elements of the vector to other vector: 

        // returns First element:
        System.out.println(arr.firstElement());

        // returns component at any index: 
        System.out.println(arr.get(3));

        // returns the hash code of the vector: It is based on the value and order of the elements:
        System.out.println(arr.hashCode());
        System.out.println(arr2.hashCode());


        //returns the Size of the vector:
        System.out.println(arr.size());

        // returns true if the vector is empty:
        System.out.println(arr.isEmpty());
        // Empty vector:
        Vector<Integer> arr3 = new Vector<>();
        System.out.println(arr3.isEmpty());

        //returns Last Element:
        System.out.println(arr.lastElement());


        // To remove one elements: 
        arr.remove(3);
        System.out.printf("this removed "+ arr.elementAt(3)+ " in the vector arr " + arr + "\n");

        // To remove all elements: 
        arr.removeAllElements();
        System.out.println(arr);

        System.out.println(arr2 + " before removing element Size : " + arr2.size());
        arr2.remove(arr2.size() -1);
        System.out.println(arr2 + " after removing element Size : " + arr2.size());

        System.out.println("Enter the size of Vector: ");
        int n = sc.nextInt();
        Vector<Integer> vector = new Vector<>(n);
        for(int i = 0; i<vector.capacity(); i++){
            vector.add(i+1);
        }
        System.out.println(vector);


        ArrayList a = new ArrayList(n);
        for(int i = 0; i<n; i++){
            a.add(i+1);
        }
        System.out.println(a);

        // isEmpty() method for array:
        System.out.println( a.isEmpty());


    }
}
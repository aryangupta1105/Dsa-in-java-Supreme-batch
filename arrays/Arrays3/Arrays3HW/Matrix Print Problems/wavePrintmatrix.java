import java.lang.*;
import java.util.*;

public class wavePrintmatrix{
    public static void main(String args[]){
        int[][] arr = {{1,2,3} , {4,5,6} , {7, 8, 9}};
        int j = 0;

    // Wave print an Matrix
        for(int i = 0; i<arr.length; i++){
            if(j%2 == 0){
                for(j = 0; j<arr[i].length; j++){
                    System.out.print(arr[j][i] + " ");
                }
            }
            else{
                for(j = arr[i].length-1; j>=0; j--){
                    System.out.print(arr[j][i] + " ");
                }
            }
        }
    }
}
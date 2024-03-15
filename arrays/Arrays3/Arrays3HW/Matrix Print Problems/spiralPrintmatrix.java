import java.lang.*;
import java.util.*;

public class spiralPrintmatrix{
    public static void main(String args[]){
        int[][] arr = {{1,2,3} , {4,5,6} , {7, 8, 9}};
        int m = arr.length;
        int n = arr[0].length;
        int startRow = 0; 
        int endCol = n-1;
        int endRow = m-1;
        int startCol = 0;
        int total_elements = m*n;

        Vector<Integer> ans = new Vector<>();

        int count = 0;
        while(count < total_elements){
            for(int i = startCol; i<endCol; i++){
                ans.add(arr[startRow][i]);
                count++;
                System.out.print(arr[startRow][i] + " ");
            }
            startRow++;
            for(int i = startRow; i<endRow; i++)
            {
                ans.add(arr[i][endCol]);
                count++;
                System.out.print(arr[i][endCol] + " ");
            }
            endCol--;
            for(int i = endCol; i>=startCol; i--){
                ans.add(arr[endRow][i]);
                count++;
                System.out.print(arr[endRow][i] + " ");
            }
            endRow--;
            for(int i = endRow; i>=startRow; i--){
                ans.add(arr[i][startCol]);
                count++;
                System.out.print(arr[i][startCol]+ " ");
            }
            startCol++;
        }
    
    }
}



public class CountNegative2dArray{

     static int countNegatives(int[][] grid) {
        int count = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                if(grid[i][j]<0) count++;
            }
        }
        return count;
    }

    public static void main(String args[])
    {

    // <-----------------------COUNT NEGATIVE ELEMENTS IN A 2D-ARRAY ------------------->
        int ar[][] = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println("The number of negative elements : " + countNegatives(ar));
    }
}

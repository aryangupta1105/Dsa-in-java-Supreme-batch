import java.lang.*;
import java.util.*;

public class flowcharts{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // Factorial program:
        // int fact = 1;
        // for(int i = n; i>=1; i--)
        // {
        //     fact *= i;
        // }
        // System.out.print(fact);

        // Prime or not:
        // if (n%2 == 0)
        // System.out.println("Prime");
        // else
        // System.out.println("Not Prime!");


        // Check maximum of three nums:
                System.out.println("a is ");
        int a = sc.nextInt();
                System.out.println("b is ");
        int b = sc.nextInt();
                System.out.println("c is ");
        int c = sc.nextInt();

        if (a>b)
        {
            if(a>c)
            {
                System.out.println("a is greatest");
            }
            else{
                System.out.println("c is greatest");
            }
        }
        else{
            if(b>c)
            {
                System.out.println("b is greatest");
            }
            else{
                System.out.println("c is greatest");
            }
        }
    }
}
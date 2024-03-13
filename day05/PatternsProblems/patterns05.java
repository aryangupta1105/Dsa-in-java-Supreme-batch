import java.lang.*;
import java.util.*;

public class patterns05
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // Hollow Rectangle program
            // System.out.println("Hello World");
            // for(int i = 0; i<5; i++)
            // {
            //     for(int j = 0; j<8; j++)
            //     {
            //         if (i == 0 || i == 4)
            //         {
            //             System.out.print("* ");
            //         }
            //         else
            //         {
            //             if (j == 0 || j == 7)
            //             {
            //                 System.out.print("* ");
            //             }
            //             else
            //             System.out.print("  ");
            //         }
            //     }
            //     System.out.println();
            // }


        // // Half Pyramid Program:
        // for(int i = 0; i<5; i++)
        // {
        //     for(int j = 0; j<i; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // Numeric half pyramid:
        // for(int i = 0; i<5; i++)
        // {
        //     for(int j = 0; j<i; j++)
        //     {
        //         System.out.print(j+1 + " ");
        //     }
        //     System.out.println();
        // }

        // // Numeric half pyramid 2
        // for(int i = 0; i<6; i++)
        // {
        //     for(int j = 0; j<i; j++)
        //     {
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

        // // Inverted Half pyramid
        // for(int i = 0; i<5; i++)
        // {
        //     for(int j = 0; j<5-i; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Hollow Half inverted Pyramid:
        // for(int i = 0; i<10; i++)
        // {
        //     for(int j = 0; j<10-i; j++)
        //     {
        //         if((i!=0 && i!=9) && (j>0 && j<9-i))
        //         {
        //             System.out.print("  ");
        //         }
        //         else System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // // numeric half inverted pyramid
        // for(int i = 0; i<5; i++)
        // {
        //     for(int j = 0; j<5-i; j++)
        //     {
        //         System.out.print(j+1 + " ");
        //     }
        //     System.out.println();
        // }
        // for(int i = 0; i<5; i++)
        // {
        //     for(int j = 0; j<5-i; j++)
        //     {
        //         System.out.print(j+1 + " ");
        //     }
        //     System.out.println();
        // }

        // Method 3:
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<5; j++)
            {
                if (i+j < 5)
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }

        // Complete pyramid
        for(int i = 0; i<=5; i++)
        {
            for (int k = 0; k<=5 ; k++)
            {
                if (k+i>=5)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            for(int j = 0; j<i; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
            
        }
        for(int i = 0; i<=5; i++)
        {
            for (int k = 0; k<=5 ; k++)
            {
                if (k+i>=5)
                System.out.print("* ");
                else
                System.out.print(" ");
            }
            System.out.println();
            
        }
        // Hollow complete Pyramid:
        for(int i = 0; i<=5; i++)
        {
            for (int k = 0; k<=5 ; k++)
            {
               if (k+i!=5 && i!=5)
                System.out.print("  ");
                else
                System.out.print("* ");
            }
            for(int j = 0; j<i; j++)
            {
                if(j!=i-1 && i!=5)
                System.out.print("  ");
                else System.out.print("* ");
            }
            
            System.out.println();
            
        }
        // Hollow complete Pyramid without base:
        for(int i = 0; i<=5; i++)
        {
            for (int k = 0; k<=5 ; k++)
            {
               if (k+i!=5)
                System.out.print("  ");
                else
                System.out.print("* ");
            }
            for(int j = 0; j<i; j++)
            {
                if(j!=i-1)
                System.out.print("  ");
                else System.out.print("* ");
            }
            
            System.out.println();
            
        }
        // Numeric Full Pyramid:
        for(int i = 0; i<=5; i++)
        {
            for (int k = 0; k<=5 ; k++)
            {
                if (k+i>=5)
                System.out.print(5-k+i);
                else
                System.out.print(" ");
            }
            for(int j = 0; j<i; j++)
            {
                System.out.print(i +j + 1);
            }
            
            System.out.println();
            
        }
       

        // Inverted Complete Pyramid:
        for(int i = 0; i<=5; i++)
        {
            for(int j = 0; j<i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k<=5 ; k++)
            {
                if (k+i<5)
                System.out.print(" *");
                else
                System.out.print(" ");
            }
            
            System.out.println();
        }
        // Hollow complete Pyramid without base:
        for(int i = 0; i<=6; i++)
        {
            for (int k = 0; k<=6 ; k++)
            {
               if (k+i!=6)
                System.out.print("  ");
                else
                System.out.print("* ");
            }
            for(int j = 0; j<i; j++)
            {
                if(j!=i-1)
                System.out.print("  ");
                else System.out.print("* ");
            }
            
            System.out.println();
            
        }
        // Inverted Hollow Complete Pyramid:
        for(int i = 0; i<=6; i++)
        {
            for(int j = 0; j<=6; j++)
            {
                if(j<i) System.out.print("  ");
                else if(j==i)System.out.print("* ");
                else System.out.print("  ");
            }

            for (int k = 0; k<=5 ; k++)
            {
                if (k+i<5)
                System.out.print("  ");
                else if(k+i == 5) System.out.print("* ");
            }
            
            System.out.println();
        }
        // Flipped solid diamond:
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<5; j++)
            {
                if(i+j < 5) System.out.print("*");
                else System.out.print(" ");
            }
            for(int k = 0; k<5; k++)
            {
                if(k>=i) System.out.print("*");
                else System.out.print(" ");
            }

            System.out.println();
        }

        for(int i = 0; i<6; i++)
        {
            for(int j = 0; j<5; j++)
            {
                if(j<i) System.out.print("*");
                else System.out.print(" ");
            }

            for(int k=0; k<5; k++)
            {
                if(k+i<5)
                System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }

        // Fancy Pattern 01
        for(int i =0; i<5; i++)
        {
            for(int j = 0; j<i+1; j++)
            {
                System.out.print(i+1);
                if(j!=i) System.out.print("*");
            }
            System.out.println();
        }

        // Fancy Pattern 02
        for(int i =0; i<5; i++)
        {
            for(int j = 0; j<i+1; j++)
            {
                System.out.print(i+1);
                if(j!=i) System.out.print("*");
            }
            System.out.println();
        }
        for(int i =0; i<5; i++)
        {
            for(int j = 0; j<5; j++)
            {
                if(i+j < 5)
                   { System.out.print(5-i);
                     if(j<4-i)System.out.print("*");
                    }
            }
            System.out.println();
        }

            System.out.println();
            System.out.println("Alphabet palindrome pattern:");

    // Alphabet palindrome pattern: 
    
    for(int i = 0; i<5; i++)
    {
        int j;
        for(j=0; j<i+1; j++){
            int ans = j +1;
            char ch = (char)(ans + 'A' -1);
            System.out.print(ch);
            }
        j = j-1;
        for(int k=j; k>0; k--)
        {
            int ans = k;
            char ch = (char)(ans + 'A' -1);
            System.out.print(ch);
        }

        System.out.println();
    }



        
    }
}
package Dsa.Self;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
               Scanner in = new Scanner(System.in);
               System.out.print("Enter No. of Rows: ");
               int rows = in.nextInt();
        
                                       //Right angle triangle
        
               for (int i = 1; i <= rows ; i++)      //For Rows
               {
                   for (int j = 1; j <= i; j++)     //For Columns
                   {
                   System.out.print("* ");
                   }
                   System.out.println();
               }
               in.close();
        
                //Number triangle q4
        
        //        for (int i = 1; i <=rows; i++)   //row loop
        //        {
        //            for (int j = 1; j <=i; j++)     //column loop
        //            {
        //                if (j == 1)
        //                {
        //                    System.out.print(j);
        //                }
        //                else
        //                {
        //                    System.out.print(" "+j);
        //                }
        //            }
        //            System.out.println();
        //        }
        
                //
        //        for (int i = 1; i <= rows ; i++)      //For Rows
        //        {
        //            for (int j = 1; j <= i; j++)     //For Columns
        //            {
        //                if ((i+j)%2 == 0)
        //                {
        //                    System.out.print(1);
        //                }
        //                else
        //                {
        //                    System.out.print(0);
        //                }
        //            }
        //            System.out.println();
        //        }
        
        
                //Question 3
        
        //        for (int i = 1; i <= rows ; i++)      //For Rows
        //        {
        //            for (int j = rows-i; j >= 0; j--)     //For Columns
        //            {
        //                System.out.print(" ");
        //            }
        //            int k =i;
        //            for ( k = i; k <= 2*i-1 ; k++)
        //            {
        //                System.out.print(k);
        //            }
        //            k-=2;
        //            while (k>=i)
        //            {
        //                System.out.print(k);
        //                k--;
        //            }
        //            for ( k = i; k <= 2*i-1 ; k--)
        //            {
        //                System.out.print(k);
        //            }
        //            System.out.println();
        //        }
        
        
        
        //        for (int i = 1; i <=rows; i++)                     //row loop
        //        {
        //            for (int spaces = 1; spaces <= rows-i ; spaces++)
        //            {                                                            //0 loop
        //                System.out.print("0 ");
        //            }
        //
        //            int val = i;
        //            for (int Count = 1; Count <= i ; Count++)     //Increment no. loop value starting from row no. itself
        //            {
        //                System.out.print(val + " ");
        //                val++;
        //            }
        //            val = val-2;
        //            for (int count = 1; count <= i-1; count++)
        //            {                                           //decrement loop  in 3 row whn printed 5 val will -
        //                System.out.print(val + " ");                   //- be 6 so to print 4 after val-2
        //                val--;
        //            }
        //            for (int spaces = 1; spaces <= rows-i ; spaces++)
        //            {                                                            //0 loop
        //                System.out.print("0 ");
        //            }
        //            System.out.println();
        //        }
        
        
        
        
        //        Scanner in = new Scanner(System.in);
        //        // System.out.print("Enter No. of Rows: ");
        //        int rows = in.nextInt();
        //
        //        for (int i = rows; i >=1; i--)   //row loop
        //        {
        //            for (int j = 1; j<=i; j++)     //column loop
        //            {
        //                System.out.print(j);
        //                if(j<i)
        //                {
        //                    System.out.print(" ");
        //                }
        //            }
        //            System.out.println();
        //        }
        
        
                // Scanner in = new Scanner(System.in);
                // int rows = in.nextInt();
        
                // for (int i = 1; i <= rows ; i++)
                // {
                //     for (int col = 1; col <= i ; col++)
                //     {
                //             System.out.print((char)(i+64));
                //             if (col<i)
                //             {
                //                 System.out.print(" ");
                //             }
                //     }
                //     System.out.println();
                // }
                // in.close();
    }
}

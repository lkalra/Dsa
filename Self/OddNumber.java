package Dsa.Self;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {

        //        Scanner in = new Scanner(System.in);
        //        System.out.print("enter the number: ");
        //        int n = in.nextInt();
        //
        //        if (n % 2 == 0){              // % means remainder 0
        //            System.out.println("Entered number is not odd");
        //        }
        //        else
        //        {
        //            System.out.println("entered number is odd number");
        //        }
        
                Scanner sc = new Scanner (System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                int hcf = 0;
        
                for (int i = 1; i<= a && i<= b; i++)
                {
                    if (a%i == 0 && b%i == 0)
                        hcf = i;
                }
                System.out.println(hcf);
                sc.close();
    }
}

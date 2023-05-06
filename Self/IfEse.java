package Dsa.Self;

import java.util.Scanner;

public class IfEse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //        int a = 10;
        //        if (a == 10) ;
        //        System.out.println("Hello World");


        int Age = in.nextInt();
        if (Age >= 13)
        {
            System.out.println("you can ride!");
        }
        else
        {
            System.out.println("you cannot ride!");
        }
        in.close();
    }
}

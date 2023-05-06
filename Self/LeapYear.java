package Dsa.Self;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if(year % 4 == 0)
        {
            System.out.println("Yes it is leap year");
        }
        else
        {
            System.out.println("No");
        }
        in.close();
    }
}

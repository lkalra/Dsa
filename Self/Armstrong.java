package Dsa.Self;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int temp = n;
        int ans = 0;
        while (n != 0)
        {
            int rem = n % 10;
            n = n / 10;
            ans = ans + rem*rem*rem;
        }
        if (ans == temp)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
        in.close();
    }
}

package Dsa.Self;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        //fibonachi number - sum of previous two numbers
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int A = 0;
        int B = 1;
        int C = 0;

        for(int i=0;i<T;i++)
        {
            int N = sc.nextInt();
            while (C < N) {
                C = A + B;
                A = B;
                B = C;
            }
            if (C == N) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}

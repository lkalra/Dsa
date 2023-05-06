package Dsa.Self;

import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);

        // int num1 = in.nextInt();
        // int num2 = in.nextInt();

        // int sum = num1 + num2;5

        // System.out.println("sum = " + sum);


        // System.out.print("Enter Number 1: ");
        // int num1 = in.nextInt();

        // System.out.print("Enter Number 2: ");
        // int num2 = in.nextInt();

        // int sum = num1+num2;
        // System.out.print("The Sum: " + sum);

        //          Calculate percentage of marks of 5 subject.
        // System.out.print("enter physics marks: ");
        // float a = in.nextInt();
        // System.out.print("enter chemistry marks: ");
        // float b = in.nextInt();
        // System.out.print("enter maths marks: ");
        // float c = in.nextInt();
        // System.out.print("enter english marks: ");
        // float d = in.nextInt();
        // System.out.print("enter hindi marks: ");
        // float e = in.nextInt();

        // float f = a+b+c+d+e;                           //percentage can be in decimals
        // float percentage = f*100/500;
        // System.out.println("percentage" + percentage);

        //                          Convert Km to miles
        // System.out.println("Enter value in Km");
        // float km = in.nextFloat();

        // float miles = km*0.62137f;
        // System.out.println(miles);


             //sum through method
        sum();
    }
    static void sum()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum: " + sum);
        in.close();
    }
}
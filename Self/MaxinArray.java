package Dsa.Self;

import java.util.Scanner;

public class MaxinArray {
    public static void main(String[] args) {

        //Example 1
        //        int[] arr = {1, 3, 23, 9, 18};
        //        System.out.println(max(arr));
        //    }
        //    static int max (int[] arr)
        //    {
        //        int maxval = arr[0];
        //        for (int i = 1; i < arr.length; i++)
        //        {
        //            if (arr[i] > maxval)
        //            {
        //                maxval = arr[i];
        //            }
        //        }
        //        return maxval;

                      //Example 2

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;
        if (b>max)
        {
        max = b;
        }
        if (c>max)
        {
        max = c;
        }
        System.out.println(max);
        in.close();
    }
}

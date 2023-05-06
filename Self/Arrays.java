package Dsa.Self;

import java.util.Comparator;

public class Arrays {
    public static void main(String[] args){

        int [] arr = new int [] {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //Loop through the array in reverse order
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }


        //        //Array - Collection of similar type of datatype
        //                        //Classroom of 500 students - store marks
        //                           int[] marks = new int[5];
        //                         //Reference   //Object   //Memory allocation
        //
        //                                       //Method 1
        //        marks[0] = 100;
        //        marks[1] = 90;
        //        marks[2] = 80;
        //        marks[3] = 70;
        //        marks[4] = 60;
        //
        //        System.out.println(marks[4]);
        //
        //                                         //Method 2
        //        int[] marks1;
        //        marks1 = new int[5];
        //
        //                                         //Method 3
        //        int[] marks2 = {100, 90, 80, 70, 60};
        //             //Declaring & initialising
        //
        //                 //Case 1 - to find array length
        //        int[] marks3 = {100, 90, 80, 70, 60};
        //        System.out.print(marks3.length);
        //
        //                 //Case 2 - to find array length string
        //        String[] Students = {"Lakshaya","Kalra"};
        //        System.out.print(Students.length);
        //
        //                   //Displaying the array(for loop) - Known as array traversal
        //        for (int i = 0; i < marks.length; i++)
        //        {
        //            System.out.println(marks[i]);
        //        }
        
    }

    public static void sort(int[] a, Comparator<Object> reverseOrder) {
    }
}

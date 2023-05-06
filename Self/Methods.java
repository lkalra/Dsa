package Dsa.Self;

public class Methods {
    
                                    //Example 1
        //    static void myMethod() {    // void when not needed return value
        //        System.out.println("I just got executed!");
        //    }
        //
        //
        //    public static void main(String[] args) {
        //        myMethod();
        //        myMethod();
        //    }

                                  //Example 2

        //    static int myMethod(int x) {     //Return cause needed return value
        //        return 5 + x;
        //    }
        //
        //    public static void main(String[] args) {
        //        System.out.println(myMethod(3));
        //    }

        //Change of 0th index through method
                             static void change (int [] arr)
                             {
                                 arr[0] = 98;
                             }
                             public static void main(String [] args)
                             {
                                 int [] marks = {75, 76, 77, 78, 79,80};
                                 change (marks);
                                 System.out.println("Value of changed index " + marks[0]);
                             }
}

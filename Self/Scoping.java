package Dsa.Self;

public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        // int b = 20;

        {
            //Block Scoping - values initialised in this block will remain in this block
            //            int a = 100;       // cannot initialize the value of a again
            a=100;            // but can reassign it, Can updae it
            System.out.println(a);
        }
            System.out.println(a);

            // You can access the variable inside specific function
            // Block Scope { Value }
            // value initialised in this block will remain in this block but can reassign the new value
            // For Ex:
            // int a = 10;
            // {a=100}  reassigned the value
            // In primitive datatypes value is passed will not change original (int, String)
            //  In non primitive datatypes( Which can further break in letters) ( Array ) original value will change cause
            //  of pass in reference.
    }
}

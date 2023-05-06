package Dsa.Self;

public class Shadowing {
    static int x = 90;          // Shadowed at line 8. // Anything you are using in main function you have to use static
    public static void main(String[] args) {
        System.out.println(x);                   //90
        int x = 40;
        System.out.println(x);           //40    //Lowe level x rewriting the upper level x
    }
}

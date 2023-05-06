package Dsa.Self;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fruit = in.next();
        switch (fruit)
        {
            case "apple":
                System.out.println("An apple a day keeps the doctor away");
                break;

            case "mango":
                System.out.println("King of fruits");
                break;

            default:
                System.out.println("Please enter valid fruit");
                break;
        }
        in.close();



        //        int day = in.nextInt();
        //        switch (day) {                                        // Alt+Enter enhanced switch
        //            case 1 -> System.out.println("Monday");
        //            case 2 -> System.out.println("Tuesday");
        //            case 3 -> System.out.println("Wednesday");
        //            case 4 -> System.out.println("Thursday");
        //            case 5 -> System.out.println("Friday");
        //            case 6, 7 -> System.out.println("Weekend");
        //        }



    }
}

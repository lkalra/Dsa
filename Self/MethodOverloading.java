package Dsa.Self;

public class MethodOverloading {
    public static void main(String[] args) {

                                   //Example 1
        
                //        fun ('a');          // Gonna call int
                //        fun ("Kalra");       // Gonna call string
                //    }
                //    static void fun (int a) {
                //        System.out.println(a);
                //    }
                //    static void fun (String name){
                //        System.out.println(name);
        
                                     // Example 2
        
                int ans = sum(3, 4, 5);
                System.out.println(ans);
            }
            static int sum(int a, int b){
                return a+b;
            }
            static int sum(int a, int b, int c){
                return a+b+c;
            }
}

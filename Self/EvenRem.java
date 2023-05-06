package Dsa.Self;

import java.util.Scanner;

public class EvenRem {
    public static void main(String[] args) {

        //check if remainder is even or not
               Scanner sc = new Scanner(System.in);
               int A = sc.nextInt();  //number to be divisor
               int N = sc.nextInt();  //number of elements
               int B[] = new int[N];  //inserting no. of element in array
               int count = 0;
               for(int i=0;i<N;i++){
                   B[i] = sc.nextInt();
                   int checkEven = B[i]%A;
                   if(checkEven % 2 ==0){
                       count++;
                   }
               }
               System.out.println(count);
               sc.close();
    }
}

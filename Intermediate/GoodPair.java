package Dsa.Intermediate;
import java.util.Scanner;

public class GoodPair {
    public static void main(String[] args) {
        //Given integer array A & integer B - required to return count of pairs having sum B
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter number of elements in array : ");
       int n = sc.nextInt();
       int A[] = new int[n];
       System.out.print("Enter elements in array : ");
       for (int i = 0; i<n; i++){
           A[i] = sc.nextInt();
       }
       System.out.print("Enter the sum to get the number of pairs : ");
       int B = sc.nextInt();;
       int i,j = 0;                 //initialise i and j
       int Count = 0;             //initial result
       for (i=0; i<A.length; i++)
       {
           for (j=i; j<n; j++)
           {
               if (A[i]+A[j] == B && i!=j)
               {
                   Count++;
               }
           }
       }
       System.out.println("Count of pairs having sum B: "+Count);
    }
}
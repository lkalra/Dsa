package Dsa.Intermediate;
import java.util.Arrays;

public class pair {
    static boolean findpair (int arr[], int size, int n){
        Arrays.sort(arr); 

        int l =0;
        int r = 1;

        n = Math.abs(n);

        while(l<size && r<size){
            int diff = arr[r]-arr[l];

            if (l!=r && diff==n){
                return true;
            }
            else if (diff>n){
                l++;
            }
            else
            r++;
        }
        return false;
        
    }
    public static void main(String[] args){
        int arr[] = {1,2, 3, 10, 15};
        int size = arr.length;
        int n =5;
        
        System.out.println(findpair(arr,size,n));
    }
}
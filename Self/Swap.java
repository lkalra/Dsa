package Dsa.Self;

public class Swap {
    // public static int[] productArrayBrute (int arr[]){
    //     int n = arr.length;
    //     int prod[]=new int[n];
    //     for (int i=0; i<n; i++){
    //         int curr=1;
    //         for(int j=0; j<n; j++){
    //             curr=curr*arr[j];
    //         }
    //         prod[i]=curr;       
    //     }
    //     return prod;
    // }
    public static void main(String[] args) {
        int prod[]={1, 0, 3, 4};
        productArray(prod);
        // int res[] =productArrayBrute(prod);
        // for (int i=0; i<res.length; i++){
        //     System.out.println(res[i]);
        // }
    }

    public static void productArray (int arr[]){
        int n= arr.length;
        int i, temp=1;
        int product[] = new int[n];

        //initialize product array as 1
        for(int j=0; j<n; j++){
            product[j]=1;
        }
        //product of elements on left excluding arr[i]
        for(i=0; i<n; i++){
            product[i]=temp;
            temp*=arr[i];
        }
        //temp 1 for product of right side of arr[i]
        temp =1;
        //temp has products of elements on right excluding of arr[i]
        for(i=n-1; i>=0; i--){
            product[i]*=temp;
            temp*=arr[i];
        }
        for(i=0; i<n; i++){
            System.out.print(product[i]);
        }
    }
}
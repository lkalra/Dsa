package Dsa.Intermediate;
import java.util.*;

public class AlternatingSubarray{
    public static void main(String[] args) {
        int A[] ={1,0,1,0,1};
        int B = 1;
        // int Ans[] = AlternatingSubarray.solve(A,B);
        // for (int i=0;i<Ans.length;i++){
        //     System.out.print(Ans[i]+" ");
        // }
        System.out.println(Arrays.toString(solve(A,B)));
    }

    public static int[] solve(int[] A, int B) {
        int n = A.length;
        int len = 2*B+1;
        ArrayList<Integer> ans = new ArrayList<Integer>(); //dont know how many centres so took arraylist
        for (int i=0;i<n-len+1;i++){ //thr will be n-len+1 subarray of b length
            int prev = -1;
            int flag = 1;
            for (int j=i;j<i+len;j++){
                if (A[j]==prev){
                    flag=0;
                    break;
                }
                prev = A[j];
            }
            if (flag==1){
                ans.add(i+B);
            }
        }
        int ansArray[] = new int[ans.size()];
        for (int i=0;i<ansArray.length;i++){
            ansArray[i]=ans.get(i);
        }
        return ansArray;
    }
}





// A = 1 1 0 1 1
// B = 1

// len = 2*B+1 = 3
// n-len+1 = 3 //3 subarrays of 3 length in this array
// for i = 0, j will traverse 0 to < i+len(0+3)= 0 - 2(index)
// subarray will be 1 1 0
// prev = -1
// a[j](1) is not equal to prev so will update prev to 1, j++
// a[j](second 1) equal to prev will make flag 0 and break

// increment i to next subarray i = 1, j 1 to < i+len(1-3 index)
// subarray will be 1 0 1
// prev = -1
// a[j](1) is not equal to prev so will update prev to 1, j++
// a[j](0) is not equal to prev so will update prev to 0, j++
// a[j](1) is not equal to prev so will update prev to 1

// loop didnt break till 3 index so flag value is 1
// if flag is 1 i+b (1+1) = 2 add the centre of alternate index in list 
package Dsa.Intermediate;

import java.util.Collections;
import Dsa.Self.Arrays;

public class Testing {
    public static void main(String[] args) {
        
    }
    public int solve(int[] A) {
        int ans=0;
        Arrays.sort(A, Collections.reverseOrder());
        for(int i=0;i<A.length;i++){
            ans=ans+(A[i]*(i+1)); //A[i]*(i+1)= ith element will come this many times
        }
        return ans;
    }
}
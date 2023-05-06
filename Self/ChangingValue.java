package Dsa.Self;

import java.util.Arrays;

public class ChangingValue {
    public static void main(String[] args) {
        // Create an array
      int [] arr = {1, 2, 3, 4, 5,};
      change (arr);
      System.out.println(Arrays.toString(arr));
    }
  static void change (int[] nums){
      nums[0] = 99;
    }
}

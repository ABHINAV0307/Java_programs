package com.abhi.Bit_Manipulation;

import java.util.Scanner;

public class uniqueINarray {
    public static void main(String[] args) {
        int[] arr = {2,2,1};

       System.out.println(ans(arr));
    }
        private static int ans(int []arr){
            int unique = 0;
            for (int i = 0; i < arr.length; i++) {
                unique ^= arr[i];
            }

        return (unique);
    }
}

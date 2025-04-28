package com.abhi.Pattern;
/*
Pattern to print
 *
 * *
 * * *
 * * * *
 * * *
 * *
 *

 */



public class left_triangle {
    public static void main(String[] args) {
pattern(4);
    }
    static void pattern(int n) {
        int c=0, k =0,flag=0;
        for (int i=0;i<2*n;i++) {

            if (i >= n) {
                c++;
                i = i - 1;
            }

            for (int j = i - c; j >= 0; j--) {
                System.out.print("* ");
                k = k + 1;


                if (((((n) * (n + 1)) / 2) + (((n) * (n - 1)) / 2)) == k){
                     flag=1;
                    break;
            }
        }
            if(flag==1)
                break;
            System.out.println(" ");
        }

    }
}

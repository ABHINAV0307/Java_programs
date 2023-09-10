package com.abhi.Playground;

public class bit {
    public static void main(String[] args) {
        int n=6;
        int flag=0;
        int temp=n;
        int cnt=0;
        while(n!=0) {
            if ((n & 1) == 0) {
                flag=1;
                break;
            } else {
                cnt = cnt + 1;
                n = n >> 1;
            }
        }
        System.out.println(temp|(1<<cnt-1+flag));
    }
}

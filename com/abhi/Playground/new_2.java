package com.abhi.Playground;

public class new_2 {
    public static void main(String[] args) {
    int val=2;
    int pow=4;
        System.out.println(solve(val,pow));
        System.out.println(calc(val,pow));

    }
    public static int calc(int val,int pow){
        if(pow==0){
            return 1;
        }
        double temp=calc(val,pow/2);
        temp=temp*temp;
        if(pow%2==0){
            return (int)temp;
        }else
            return (int) (temp*val);
    }
    public static double solve(double x, long n) {
        if (n == 0) {
            return 1; // power of 0 is 1
        }
        double temp = solve(x, n / 2);
        temp = temp * temp;

        if (n % 2 == 0) { // if even, return just without doing anything
            return temp;
        } else {
            return temp * x; // if odd, return by multiplying once more with the given number
        }
    }

}

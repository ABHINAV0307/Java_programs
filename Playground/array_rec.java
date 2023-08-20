package com.abhi.Playground;

import java.util.Arrays;

public class array_rec {
    public static void main(String[] args) {
        int []arr=new int[]{1,2,3,4,5,7,8,9,10,11};
    int fsmall=Integer.MAX_VALUE;
    int ssmall=Integer.MAX_VALUE;

    int fbig=Integer.MIN_VALUE;
    int sbig=Integer.MIN_VALUE;


//    he prabhu he hariram krishnam jagannatham prem nandi

    for(int i=0;i<arr.length;i++) {
        if (arr[i] > fbig) {
            sbig=fbig;
            fbig = arr[i];
        }
        else if (arr[i] > sbig && sbig != fbig) {
            sbig = arr[i];
        }
    }
    for(int i=0;i<arr.length;i++) {
        if (arr[i] < fsmall) {
            fsmall = arr[i];
        } else if (arr[i] < ssmall && ssmall != fsmall) {
            ssmall = arr[i];
        }
    }

        System.out.println("first big-->"+fbig + "   Second big-->"+sbig);

        System.out.println("first small-->"+fsmall+" Second small-->"+ssmall);


        int end=arr.length-1;
   op(arr,0,end);

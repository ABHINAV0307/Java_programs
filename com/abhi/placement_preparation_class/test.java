package com.abhi.placement_preparation_class;

public class test {
    public static void main(String[] args) {

        int n=4;
        int []ltr=new int [n];
        int []rtl=new int [n];
        ltr[0]=1;
        rtl[n-1]=n;
        for(int i=1;i<n;i++){
            ltr[i]=(i+1)+ltr[i-1];
        }
        for(int i=n-2;i>=0;i--){
            rtl[i]=(i)+rtl[i+1];
//            System.out.print(i+"  ");
//            System.out.println();
            System.out.print(rtl[i]+"  ");
        }
        System.out.println(" ");
        for(int i=0;i<n;i++){
            System.out.print(ltr[i]+"  ");
        }
        System.out.println(" ");
        for(int i=0;i<n;i++){
            System.out.print(rtl[i]+"  ");
        }
    }
}

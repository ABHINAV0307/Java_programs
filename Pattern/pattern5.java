package com.abhi.Pattern;
//PATTERN TO PRINT 
//        44444
//        43334
//        43234
//        43334
//        44444
public class pattern5 {
    public static void main(String[] args) {
        patternk(4);
    }
    static void patternk(int n){
        for(int i=0;i<=n;i++){
            for (int j=0;j<=n;j++){
                int val=Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(n-val);
            }
            System.out.println();
        }
    }
}

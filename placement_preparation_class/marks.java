package com.abhi.placement_preparation_class;

public class marks {
    public static void main(String[] args) {
        int []arr=new int[]{9,9};
        int l=arr.length;
        int val=1;
        int flag=0;
        int a=0;
        for(int i=0;i<arr.length;i++){
            a=(a*10)+arr[i];
           // val=val*10;
        }
        a=a+1;
        int n=a;
        while(n>0){
            flag++;
        }
        System.out.println(a);
        if(arr[0]==9){
            l=l+1;
        }
        int []arr1=new int[l];
        for(int i=0;i<l;i++){
            arr1[i]=a%10;
            a=a/10;
        }

}

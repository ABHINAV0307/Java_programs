package com.abhi.Linear_algo;

import java.util.Scanner;

public class linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to search");
        int k = sc.nextInt();
int [] arr=new int[5];
        //System.out.println("Enter Element of Array");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }


        int checking = check(arr, k);
        System.out.println(checking);
    }

    static int check(int[] arr, int b) {
        for (int i = 0; i < 5; i++) {
            if (arr[i] == b)
            {
                return i;
            }
        }
            return -1;


        }
    }

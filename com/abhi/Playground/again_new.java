package com.abhi.Playground;

import java.util.*;

public class again_new {
    public static void main(String[] args) {

        int[] arr = new int[]{5, 7, 7, 8, 8, 10};
        int n = arr.length;
        int x = 8;
        int low = 0;
        int high = n - 1;
        int occ = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                occ++;
                int left = mid - 1;
                int right = mid + 1;
                while (left >= 0 && arr[left] == x) {
                    occ++;
                    left--;
                }
                while (right < n && arr[right] == x) {
                    occ++;
                    right++;
                }
                System.out.println(left+1);
                System.out.println(right-1);
                break;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}

        //  System.out.println();


//        Set<Integer> set = new HashSet<Integer>();
//        int[] arr = new int[]{3, 2, 3, 3, 2, 2, 2, 3, 5,};
//
//        int val1 = Integer.MIN_VALUE;
//        int val2 = Integer.MIN_VALUE;
//        int cnt1 = 0, cnt2 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (cnt1 == 0 && val2 != arr[i]) {
//                cnt1 = 1;
//                val1 = arr[i];
//            } else if (cnt2 == 0 && val2 != arr[i]) {
//                cnt2 = 1;
//                val2 = arr[i];
//            } else if (val1 == arr[i]) {
//                cnt1++;
//            } else if (val2 == arr[i]) {
//                cnt2++;
//            }
//        }
//    }
//}


//        List<Integer> ls = new ArrayList<>(); // list of answers
//ls.add(val1);
//        ls.add(val2);
//        System.out.println(ls);
//        System.out.println(val1);
//        System.out.println(val2);

//            int[] arr = new int[]{3,1,-2,-5,2,-4};
//       int []val=new int[arr.length];
//       int a=0;
//       int b=1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>0){
//                val[a]=arr[i];
//                a=a+2;
//            }
//            else{
//                val[b]=arr[i];
//                b=b+2;
//            }
//        }
            // System.out.println(Arrays.toString(val));


//        List<Integer> list=new ArrayList<Integer>();

//list.add(arr[arr.length-1]);
//        int max=arr[arr.length-1];
//        for(int i=arr.length-2;i>=0;i--){
//            if(arr[i]>max){
//            max=arr[i];
//                list.add(max);
//            }
//        }
//        System.out.println(list);



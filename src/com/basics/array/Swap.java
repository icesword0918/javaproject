package com.basics.array;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Arrays.fill(arr,7);
        for(int i=0;i<arr.length;i++){
            System.out.println("第"+(i+1)+"个元素是："+arr[i]);
        }
        int[] arr1=new int[]{23,12,3,1,23,41,14,5,23};
        Arrays.fill(arr1,2,5,99);
        for(int i=0;i<arr1.length;i++){
            System.out.println("第"+(i+1)+"个元素是："+arr1[i]);
        }
    }
}

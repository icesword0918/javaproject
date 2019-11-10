package com.basics.array;

import java.util.Arrays;

public class Taxis {
    public static void main(String[] args) {
        int[] arr=new int[]{23,12,45,14,54,5,7,90};
        System.out.println("原一维数组是：");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        Arrays.sort(arr);
        System.out.println("\n排序后一维数组是：");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

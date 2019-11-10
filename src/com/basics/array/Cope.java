package com.basics.array;

import java.util.Arrays;

public class Cope {
    public static void main(String[] args) {
        int[] arr=new int[]{23,12,45,14,54,5,7,90};
        System.out.println("原一维数组是：");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        int[] newarr= Arrays.copyOf(arr,22);
        System.out.println("\n复制后数组是：");
        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");

        }
        int[] newarr1= Arrays.copyOfRange(arr,5,15);
        System.out.println("\n复制后数组是：");
        for(int i=0;i<newarr1.length;i++){
            System.out.print(newarr1[i]+" ");

        }
    }
}

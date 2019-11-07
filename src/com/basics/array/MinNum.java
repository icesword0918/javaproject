package com.basics.array;

public class MinNum {
    public static void main(String[] args) {
        int[] num={5,3,6,2,7,1,9,3,2};
        System.out.println("输入的一维数组是：");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+",");
        }
        int min=num[0];
        for(int j=0;j<num.length-1;j++){
            if(min>num[j]){
                min=num[j];
                }
        }
        System.out.println("\n 数组中最小的值是："+min);
    }
}

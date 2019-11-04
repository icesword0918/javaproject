package com.basics;

public class GetSum {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while (i<=10){
            sum=sum+i;
            i++;
        }
        System.out.println("1到10的和是："+sum);
    }
}

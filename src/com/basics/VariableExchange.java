package com.basics;

import java.util.Scanner;

public class VariableExchange {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入变量A的值");
        long A=scan.nextLong();
        System.out.println("请输入变量B的值");
        long B=scan.nextLong();
        System.out.println("A="+A+"\tB="+B);
        System.out.println("执行变量互换...");
        A=A^B;
        B=B^A;
        A=A^B;
        System.out.println("A="+A+"\tB="+B);

        System.out.println("请输入一个数字");
        long number=scan.nextLong();
        String check=(number%2==0)? "这个数字是：偶数":"这个数字是：奇数";
        System.out.println(check);

    }
}

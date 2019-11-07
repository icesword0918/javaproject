package com.basics.structure;

public class Export {

    public static void main(String[] args) {
        int i='d';
        char c=97;
        System.out.println("字符d的unicode码是："+i);
        System.out.println("unicode代表的字符是："+c);

        char char1='\\';
        char char2='\u2605';
        System.out.println("输出反斜杠："+char1);
        System.out.println("输出五角星："+char2);
    }
}

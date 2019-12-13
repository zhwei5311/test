package com.study.exercise;

/**
 * 定义一个方法，该方法能够找出三个整数中的最大值并返回。
 * 在主方法中调用方法测试执行。
 */
public class Function2 {
    public static void main(String[] args) {
        System.err.println(getMax(5,2,3));
    }
    public static int getMax(int a,int b,int c) {
        return ((a > b)? a : b) > c ?((a > b)? a : b) : c;
    }
}

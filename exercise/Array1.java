package com.study.exercise;

/**
 * 创建一个长度为5的整数数组，数组中有5个整数(直接赋值即可)。遍历数组中的每个元素，元素之间用空格隔开。比如：
 *
 * ```
 * 数组为：{1,2,3,4,5}
 * 打印结果：1 2 3 4 5
 * ```
 */
public class Array1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        for(int i = 0;i < arr.length;i++) {
            System.err.print(arr[i] + " ");
        }
    }
}

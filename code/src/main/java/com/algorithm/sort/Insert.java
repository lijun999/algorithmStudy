package com.algorithm.sort;

import java.util.Arrays;

/**
 * 插入排序
 * 过程：
 * 1.保证0-0上有序
 * 2.保证0-1上有序
 * 3.保证0-2上有序
 * 。。。。。
 */
public class Insert {
    public static void main(String[] args) {
        int times = 10000;
        int maxLength = 1000;
        int maxValue = 1000000;
        System.out.println("测试开始");
        for (int i = 0; i < times; i++) {
            int[] arr = SortUtils.getRandonArr(maxValue, maxLength);
            int[] arr1 = SortUtils.copyArr(arr);
            int[] arr2 = SortUtils.copyArr(arr);
            insertSort(arr1);
            Arrays.sort(arr2);
            SortUtils.checkArr(arr,arr1,arr2);
        }
        System.out.println("测试结束");
    }

    public static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    SortUtils.swap1(arr,j,j-1);
                }
            }
        }
    }

}

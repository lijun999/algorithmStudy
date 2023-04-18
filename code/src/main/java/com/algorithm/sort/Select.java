package com.algorithm.sort;

import java.util.Arrays;

/**
 * 选择排序
 * 过程：
 * 从0-N-1上选择一个最小的放到0位置；
 * 从1-N-1上选择一个最小的放到1位置
 * 。。。。。
 */
public class Select {
    public static void main(String[] args) {
        int times = 10000;
        int maxLength = 1000;
        int maxValue = 1000000;
        System.out.println("测试开始");
        for (int i = 0; i < times; i++) {
            int[] arr = SortUtils.getRandonArr(maxValue, maxLength);
            int[] arr1 = SortUtils.copyArr(arr);
            int[] arr2 = SortUtils.copyArr(arr);
            select(arr1);
            Arrays.sort(arr2);
            SortUtils.checkArr(arr,arr1,arr2);
        }
        System.out.println("测试结束");
    }

    public static void select(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int i = 0; i < N - 1; i++) {
            int minInxde = i;
            for (int j = i + 1; j < N ; j++) {
                if (arr[j] < arr[minInxde]) {
                    minInxde = j;
                }
            }
            SortUtils.swap(arr,i,minInxde);
        }
    }
}

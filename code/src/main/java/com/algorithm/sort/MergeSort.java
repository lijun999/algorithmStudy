package com.algorithm.sort;

import java.util.Arrays;

/**
 * 归并排序实现
 */
public class MergeSort {
    public static void main(String[] args) {
        int times = 10000;
        int maxLength = 1000;
        int maxValue = 1000000;
        System.out.println("测试开始");
        for (int i = 0; i < times; i++) {
            int[] arr = SortUtils.getRandonArr(maxValue, maxLength);
            int[] arr1 = SortUtils.copyArr(arr);
            int[] arr2 = SortUtils.copyArr(arr);
            mergeSore1(arr1);
            Arrays.sort(arr2);
            SortUtils.checkArr(arr, arr1, arr2);
        }
        System.out.println("测试结束");
    }

    /**
     * 递归版本实现
     * @param arr
     */
    public static void mergeSore1(int[] arr){
        process(arr, 0, arr.length - 1);
    }


    /**
     * 让数组在L--R 的范围上排序
     *
     * @param arr
     * @param L
     * @param R
     */
    public static void process(int[] arr, int L, int R) {
        if (L >= R) {
            return;
        }
        int mid = L + ((R - L) >> 1);
        process(arr, L, mid);
        process(arr, mid + 1, R);
        merge(arr, L, mid, R);
    }

    private static void merge(int[] arr, int L, int M, int R) {
        int[] tmp = new int[arr.length];//空间优化，每次可以申请R-L+1的空间
        int index = L;
        int record = L;
        int rightStart = M + 1;
        while (L <= M && rightStart <= R) {
            if (arr[L] <= arr[rightStart]) {
                tmp[index++] = arr[L++];
            } else {
                tmp[index++] = arr[rightStart++];
            }
        }
        if (L <= M) {        //可以优化，直接去掉
            while (L <= M) {
                tmp[index++] = arr[L++];
            }
        }
        if (rightStart <= R) {
            while (rightStart <= R) {
                tmp[index++] = arr[rightStart++];
            }
        }
        for (int i = record; i <= R; i++) {
            arr[i] = tmp[i];
        }
    }

}

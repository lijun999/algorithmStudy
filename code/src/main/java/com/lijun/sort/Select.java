package com.lijun.sort;

/**
 * 选择排序
 * 过程：
 * 从0-N-1上选择一个最小的放到0位置；
 * 从1-N-1上选择一个最小的放到1位置
 * 。。。。。
 */
public class Select {
    public static void main(String[] args) {
        int [] arr = {1,4,2,5,6,7,22,555,43,554,76,666,33,33,665};
        select(arr);
        SortUtils.printArr(arr);
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

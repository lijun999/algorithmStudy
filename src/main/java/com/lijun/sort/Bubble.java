package com.lijun.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 冒泡排序
 * 过程：
 * arr[i-1]和arr[i]位置的数，比较大小，谁大谁排后面
 */
public class Bubble {
    //    public static void main(String[] args) {
//        int times = 10000;
//        int maxLength = 1000;
//        int maxValue = 1000000;
//        System.out.println("测试开始");
//        for (int i = 0; i < times; i++) {
//            int[] arr = SortUtils.getRandonArr(maxValue, maxLength);
//            int[] arr1 = SortUtils.copyArr(arr);
//            int[] arr2 = SortUtils.copyArr(arr);
//            bubble(arr1);
//            Arrays.sort(arr2);
//            SortUtils.checkArr(arr,arr1,arr2);
//        }
//        System.out.println("测试结束");
//    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<String[]> list = new ArrayList();
        while (sc.hasNext()) {
//        sc.nextLine()
        }
    }

    //冒泡排序，arr[i-1]和arr[i]位置的数，比较大小，谁大谁排后面
    public static void bubble(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        //arr[0] arr[1]
        //arr[1] arr[2]
        //arr[2] arr[3]
        //arr[n-1] arr[n]
        //第一个循环是从0-n-1的范围上冒泡
        //第二个循环是从0-n-2的范围上冒泡
        //第三个循环是从0-n-3的范围上冒泡
        //第四个循环是从0-n-4的范围上冒泡
        int N = arr.length;
        for (int i = 0; i < N - 1; i++) {//控制循环的次数
            for (int j = 0; j < N - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    SortUtils.swap1(arr, j, j + 1);
                }
            }
        }
    }
}

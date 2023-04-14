package com.algorithm.sort;

public class SortUtils {
    /**
     * 打印数组
     *
     * @param arr
     */
    public static void printArr(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {//交换数组的两个位置
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void swap1(int[] arr, int i, int j) {//交换数组的两个位置
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
        //异或  相同为0，不同为1
        // arr[i] ^= arr[j]; a=1---->0001 b=2---->0010 a = a^b => 0011
        // arr[j] ^= arr[i]  b= a^b => 0001
        // arr[i] ^= arr[j]  a = a^b = 0010
    }

    public static int[] getRandonArr(int maxValueRandom, int maxLengthRandom) {
        int length = (int) (Math.random() * maxLengthRandom) + 1;
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            int randomValue = (int) (Math.random() * maxValueRandom) - (int) (Math.random() * maxValueRandom);
            arr[i] = randomValue;
        }
        return arr;
    }

    public static int[] copyArr(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    /**
     *
     * @param arr 原始数组
     * @param arr1 排序后的数组
     * @param arr2 排序后的数组
     */
    public static void checkArr(int[] arr, int[] arr1, int[] arr2) {
        for (int i = 0; i < arr.length; i++) {
            if(arr1[i]!=arr2[i]){
                System.out.println("fuck!!!!!!!出错了");
                printArr(arr);
            }
        }
    }
}

package com.lijun.sort;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] chars = a.toCharArray();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        //L/R/F/B/A/C
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'L') {
                swapL(arr);
            }
            if (chars[i] == 'R') {
                swapR(arr);
            }
            if (chars[i] == 'F') {
                swapF(arr);
            }
            if (chars[i] == 'B') {
                swapB(arr);
            }

            if (chars[i] == 'A') {
                swapA(arr);
            }
            if (chars[i] == 'C') {
                swapC(arr);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }


    private static void swapL(int[] arr) {
        int i = arr[0];
        int j = arr[1];
        int k = arr[4];
        int m = arr[5];
        arr[0] = m;
        arr[1] = k;
        arr[4] = i;
        arr[5] = j;
    }

    private static void swapF(int[] arr) {
        int i = arr[2];
        int j = arr[3];
        int k = arr[4];
        int m = arr[5];
        arr[2] = m;
        arr[3] = k;
        arr[4] = i;
        arr[5] = j;
    }

    private static void swapR(int[] arr) {
        int i = arr[0];
        int j = arr[1];
        int k = arr[4];
        int m = arr[5];
        arr[4] = j;
        arr[5] = i;
        arr[0] = k;
        arr[1] = m;
    }

    private static void swapB(int[] arr) {
        int i = arr[2];
        int j = arr[3];
        int k = arr[4];
        int m = arr[5];
        arr[2] = k;
        arr[3] = m;
        arr[4] = j;
        arr[5] = i;
    }

    private static void swapA(int[] arr) {
        int i = arr[0];
        int j = arr[1];
        int k = arr[2];
        int m = arr[3];
        arr[0] = k;
        arr[1] = m;
        arr[2] = j;
        arr[3] = i;
    }

    private static void swapC(int[] arr) {
        int i = arr[0];
        int j = arr[1];
        int k = arr[2];
        int m = arr[3];
        arr[0] = m;
        arr[1] = k;
        arr[2] = i;
        arr[3] = j;
    }

}

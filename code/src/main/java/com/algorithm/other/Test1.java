package com.algorithm.other;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] a = str.split(" ");
        String re[] = new String[a.length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            String b = a[i];
            char[] c = b.toCharArray();
            sb.setLength(0);
            boolean isNeed = true;
            for (int d = c.length - 1; d >= 0; d--) {
                if (c[d] < 97 || c[d] > 122) {
                    isNeed = false;
                    break;
                }
                sb.append(c[d]);
            }
            if (isNeed) {
                re[i] = sb.toString();
            } else {
                re[i] = a[i];
            }
        }
        int count = 0;
        for (int i = 0; i < re.length; i++) {
            count += find(re[i]);
        }
        System.out.println(count);
    }

    private static int find(String s) {
        char[] chars = s.toCharArray();
        return findB(chars.length - 1, chars);
    }

    private static int findB(int length, char[] chars) {
        int count = 0;
        for (int i = length; i >= 0; i--) {
            if (chars[i] != 'e') {
                return findB(length - 1, chars) +count;
            }
            if (i < 3) {
                return 0;
            }
            if (chars[i - 1] != 'a' && chars[i - 1] != 'e' && chars[i - 1] != 'i' && chars[i - 1] != 'o' && chars[i - 1] != 'u' && chars[i - 1] != 'r') {
                if (chars[i - 2] == 'a' || chars[i - 2] == 'e' || chars[i - 2] == 'i' || chars[i - 2] == 'o' || chars[i - 2] == 'u') {
                    if (chars[i - 1] != 'a' && chars[i - 1] != 'e' && chars[i - 1] != 'i' && chars[i - 1] != 'o' && chars[i - 1] != 'u') {
                        count++;
                    } else {
                        return findB( length - 1, chars) +count;
                    }
                } else {
                    return findB(length - 1, chars) +count;
                }
            } else {
                return findB(length - 1, chars) +count;
            }
        }
        return count;
    }
}

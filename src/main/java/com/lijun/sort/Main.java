package com.lijun.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<String[]> list = new ArrayList();
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String s1[] = s.split(",");
            Arrays.sort(s1);
            list.add(s1);
        }
        for (String a[] : list) {
            for (int i = 0; i < a.length; i++) {
                if (i != a.length - 1) {
                    System.out.print(a[i] + ",");
                } else {
                    System.out.print(a[i]);
                }

            }
            System.out.println();
        }
    }
}

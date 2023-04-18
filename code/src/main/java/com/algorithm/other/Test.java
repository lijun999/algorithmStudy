package com.algorithm.other;

public class Test {

    public static void main(String[] args) {
        String[] str = new String[]{"iwdvpbn", "hk", "iuop", "iikd", "kadgpf"};
        System.out.println(findMaxValue(0, str.length - 1, str));
    }

    /**
     * 以i位置的字符串作为其中一个字符串，判断后续所有的字符串
     */
    private static Integer findMaxValue(int i, int length, String[] str) {
        if(i==length){
           return 0;
        }
        String current = str[i];
        int currentLength = current.length();
        int maxValue = 0;
        for (int j = i + 1; j < length; j++) {
            String a = str[j];
            char[] chars = a.toCharArray();
            boolean isManzu = true;
            for (char b:chars){
                if(current.contains(String.valueOf(b))){
                    isManzu = false;
                    break;
                }
            }
            if(isManzu){
                maxValue = currentLength * a.length();
            }
        }
        int p2 = findMaxValue(i+1,length,str);
        return Math.max(maxValue,p2);
    }

//    public static int dp(int i, int length, String[] str){
//        int a[][] = new int[length-1][]
//        return [0][length]
//    }
}

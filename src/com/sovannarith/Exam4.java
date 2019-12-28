package com.sovannarith;

public class Exam4 {

    public static void main(String[] args) {
        int[] a = {1, 2, 0, 0, 0, 2, -18, 0, 0, 0, 0, 12};
        int[] a2 = {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0};
        System.out.println(isZeroPlentiful(a));
        System.out.println(isZeroPlentiful(a2));
    }

    public static int isZeroPlentiful(int[] a) {
        int numZero = 0, seqZero = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                numZero++;
            } else {
                if (numZero >= 4) {
                    numZero = 0;
                    seqZero++;
                } else if (numZero > 0 && numZero < 4) return 0;
            }
        }
        if (numZero >= 4) seqZero++;
        return seqZero;
    }
}

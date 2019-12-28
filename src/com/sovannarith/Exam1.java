package com.sovannarith;

import java.util.Arrays;

public class Exam1 {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11};
        int[] arr1 = {2, 3, 6, 7, 11};
        int[] arr2 = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr3 = {7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7};
        int[] arr4 = {18, -12, 9, -10};

        // is235Array
        System.out.println("is235Array : " + is235Array(arr));
        System.out.println("is235Array : " + is235Array(arr1));
        System.out.println("is235Array : " + is235Array(arr2));
        System.out.println("is235Array : " + is235Array(arr3));

        // largestAdjacentSum
        System.out.println("largestAdjacentSum : " + largestAdjacentSum(arr4));

        // checkConcatenatedSum
        System.out.println("checkConcatenatedSum : " + checkConcatenatedSum(2, 198));
        System.out.println("checkConcatenatedSum : " + checkConcatenatedSum(3, 2997));
        System.out.println("checkConcatenatedSum : " + checkConcatenatedSum(4, 13332));

        // isSequencedArray
        int[] sArr = {1,2,2,3,4,5};
        System.out.println("isSequencedArray : " + isSequencedArray(sArr, 1, 5));
        int[] sArr2 = {-3, -2, -1, 0};
        System.out.println("isSequencedArray : " + isSequencedArray(sArr2, -3, -1));
    }

    public static int isSequencedArray(int[] a, int m, int n) {
        if (m > n || a[0] != m || a[a.length - 1] != n) return 0;
        int nextVal = m;
        for (int i = 1; i < a.length; i++) {
            if (!(nextVal == a[i] || nextVal == a[i] - 1)) return 0;
            else nextVal = a[i];
        }
        return 1;
    }

    public static int checkConcatenatedSum(int n, int catlen) {
        char[] ch = Integer.toString(catlen).toCharArray();
        int sumCatlen = 0;
        for (int i = 0; i < ch.length; i++) {
            String concet = "";
            for (int j = 0; j < n; j++) {
                concet += ch[i];
            }
            sumCatlen += new Integer(concet);
        }
        if (sumCatlen == catlen) return 1;
        return 0;
    }

    public static int largestAdjacentSum(int[] a) {
        int largestSum = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int sum = a[i] + a[i + 1];
            if (i == 0) largestSum = sum;
            else largestSum = sum > largestSum ? sum : largestSum;
        }
        return largestSum;
    }

    public static int is235Array(int[] a) {
        int divisibleCount = 0, inDivisibleCount = 0;
        int[] divisionArr = {2, 3, 5};
        int arrLength = a.length;
        boolean isDivisible;

        for (int i = 0; i < a.length; i++) {
            isDivisible = false;
            for (int j = 0; j < divisionArr.length; j++) {
                if (a[i] % divisionArr[j] == 0) {
                    divisibleCount += 1;
                    isDivisible = true;
                }
            }
            if (!isDivisible) inDivisibleCount += 1;
        }

        if (divisibleCount + inDivisibleCount != arrLength) {
            return 0;
        }
        return 1;
    }


}

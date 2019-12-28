package com.sovannarith;

import java.util.Arrays;

public class Exam3 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] a2 = {-18, 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(doIntegerBasedRounding(a, 2)));
        System.out.println(Arrays.toString(doIntegerBasedRounding(a2, 4)));
        System.out.println("isCubePowerful : " + isCubePowerful(370));
        int[] a3 = {0, -3, 0, -4, 0}, a4 = {-1, 5, 8, 17, 15};
        System.out.println(decodeArray(a3));
        System.out.println(decodeArray(a4));
    }

    public static int decodeArray(int[] a) {
        String result = "";
        if (a[0] < 0) result += "-";
        for (int i = 0; i < a.length - 1; i++) {
            result += Math.abs(a[i] - a[i + 1]);
        }
        return new Integer(result);
    }

    public static int isCubePowerful(int n) {
        int original = n;
        int sum = 0;
        while (n >= 1) {
            int mod = n % 10;
            n = n / 10;
            sum += Math.pow(mod, 3);
        }
        if (sum == original) return 1;
        return 0;
    }

    public static int[] doIntegerBasedRounding(int[] a, int n) {
        n = Math.abs(n);
        for (int j = 0; j < a.length; j++) {
            int mod = a[j] % n;
            if (a[j] >= 0) {
                if (mod < n / 2f)
                    a[j] -= mod;
                else
                    a[j] += (n - mod);
            }
        }
        return a;
    }
}

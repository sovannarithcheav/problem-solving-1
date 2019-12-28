package com.sovannarith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam2 {
    public static void main(String[] args) {
        System.out.println("Largest Prime Factor : " + largestPrimeFactor(1));
        System.out.println("Encode number : " + Arrays.toString(encodeNumber(-18)));
        int[] a = {1, 1, 2, 2, 2}, pattern = {1, 2};
        System.out.println(matchPattern(a, pattern));
        int[] a2 = {1, 1, 10, 4, 4, 3}, pattern2 = {1, 4, 3};
        System.out.println(matchPattern(a2, pattern2));
    }

    public static int matchPattern(int[] a, int[] pattern) {
        int[] aa = Arrays.stream(a).distinct().toArray();
        if (Arrays.equals(aa, pattern)) return 1;
        return 0;
    }

    public static int[] encodeNumber(int n) {
        int p = 2;
        List<Integer> result = new ArrayList<>();
        if (n <= 1) return null;
        while (n >= p) {
            if (n % p == 0) {
                result.add(p);
                n = n / p;
            } else p = p + 1;
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static int largestPrimeFactor(int n) {
        int p = 2;
        boolean isPrime = true;
        if (n <= 1) return 0;
        while (n >= p) {
            if (n % p == 0) {
                isPrime = false;
                n = n / p;
            } else p = p + 1;
        }
        if (isPrime) return n;
        return p;
    }
}

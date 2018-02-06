package com.yorgs.Sort;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class QuickSort extends AbstractSort {
    public static void sort(Comparable[] a){
        a = shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int start, int end) {
        if (end <= start)
            return;
        int j = partition(a, start, end);
        sort(a, start, j-1);
        sort(a, j+1, end);
    }

    private static int partition(Comparable[] a, int start, int end) {
        int i = start;
        int j = end + 1;
        while (true){
            while (less(a[++i], a[start]))
                if (i == end) break;
            while (less(a[start], a[--j]))
                if (j == start) break;

            if (i >= j) break;
            exchange(a, i, j);
        }

        exchange(a, start, j);
        return j;
    }

    public static Comparable[] shuffle(Comparable[] a){
        try {
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");

            for (int index = 0; index < a.length; index++) {
                int randomIndex = secureRandom.nextInt(index + 1);
                exchange(a, index, randomIndex);
            }

        }
        catch (NoSuchAlgorithmException e){

        }
        return a;
    }
}

package com.yorgs.Sort;

class AbstractSort {
    static void exchange(Comparable[] a, int i, int min) {
        Comparable swap = a[i];
        a[i]=a[min];
        a[min]=swap;
    }

    static boolean less(Comparable comparable, Comparable comparable1) {
        return comparable.compareTo(comparable1) < 0;
    }
}

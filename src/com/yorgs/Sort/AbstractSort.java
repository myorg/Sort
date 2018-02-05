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

    public static boolean isSorted(Comparable[] a) {
        return isSorted(a, 0, a.length);
    }

    public static boolean isSorted(Comparable[] a, int start, int end){
        for (int i=0; i < a.length - 1; i++){
            if (a[i].compareTo(a[i+1]) > 0){
                return false;
            }
        }
        return true;
    }
}

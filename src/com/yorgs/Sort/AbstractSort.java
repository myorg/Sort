package com.yorgs.Sort;

public class AbstractSort {
    protected static void exch(Comparable[] a, int i, int min) {
        Comparable swap = a[i];
        a[i]=a[min];
        a[min]=swap;
    }

    protected static boolean less(Comparable comparable, Comparable comparable1) {
        if (comparable.compareTo(comparable1) < 0){
            return true;
        }
        else{
            return false;
        }
    }
}

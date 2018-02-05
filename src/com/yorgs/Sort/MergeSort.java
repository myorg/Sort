package com.yorgs.Sort;

public class MergeSort extends AbstractSort {
    public static void sort(Comparable[] a) {
        Comparable[] temp = new Comparable[a.length];
        sort(a, temp,0, a.length - 1);
    }

    public static void sort(Comparable[] a, Comparable[] temp, int start, int end) {
        if (end <= start) {
            return;
        }
        int middle = start + (end - start) / 2;
        sort(a, temp, start, middle);
        sort(a, temp, middle+1, end);
        merge(a, temp, start, middle, end);
    }

    private static void merge(Comparable[] a, Comparable[] temp, int start, int middle, int end) {
        assert isSorted(a, start, middle);
        assert isSorted(a, middle+1, end);

        //Copy the current subset of values from the original array to the temp array.
        for (int k = start; k <= end; k++){
            temp[k] = a[k];
        }

        // Merge the two arrays back into the original array, a.
        int i = start;
        int j = middle + 1;
        for (int k = start; k <= end; k++){
            if (i > middle){ // First sub array has no values left
                a[k] = temp[j++];
            }
            else if (j > end){ // Second sub array has no values left
                a[k] = temp[i++];
            }
            else if (less(temp[i],temp[j])){ // Value at current index in first subarray is less than the second subarray
                a[k] = temp[i++];
            }
            else{ // Value at current index of second subarray is less than the first subarray
                a[k] = temp[j++];
            }
        }

    }
}

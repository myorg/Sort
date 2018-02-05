package com.yorgs.Sort;
import com.yorgs.Sort.SelectionSort;


public class Main {

    public static void main(String[] args) {
        long startTime;
        long endTime;
        long totalTime;
        int arraySize = 10000;
        Double[] originalArray = new Double[arraySize];
        Double[] myArray;
        System.out.println("Unsorted Array:");
        for (int i=0; i<arraySize; i++){
            originalArray[i] = Math.random();
        }
        //printArray(myArray);

        System.out.println("\nSelectionSort:");
        myArray = originalArray.clone();
        startTime = System.nanoTime();
        SelectionSort.sort(myArray);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("Elapsed Time:" + totalTime);
        System.out.println("Is Sorted? " + isSorted(myArray) + "\n");
        //printArray(myArray);


        System.out.println("\nInsertionSort:");
        myArray = originalArray.clone();
        startTime = System.nanoTime();
        InsertionSort.sort(myArray);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("Elapsed Time:" + totalTime);
        System.out.println("Is Sorted? " + isSorted(myArray) + "\n");
        //printArray(myArray);

        System.out.println("\nMergeSort:");
        myArray = originalArray.clone();
        startTime = System.nanoTime();
        MergeSort.sort(myArray);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("Elapsed Time:" + totalTime);
        System.out.println("Is Sorted? " + isSorted(myArray) + "\n");
        //printArray(myArray);

    }

    public static boolean isSorted(Double[] a){
        for (int i=0; i < a.length - 1; i++){
            if (a[i].compareTo(a[i+1]) > 0){
                return false;
            }
        }
        return true;
    }

    public static void printArray(Double[] arrayToPrint){
        for (int i=0; i<arrayToPrint.length; i++){
            System.out.println(arrayToPrint[i]);
        }
    }
}

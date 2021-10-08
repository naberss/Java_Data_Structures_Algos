package com.naberss;

public class Selection_Sort {


    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 547, 8, 6, 3, 1};


        for (int LastUnsortedIndex = arr.length - 1; LastUnsortedIndex > 0; LastUnsortedIndex--) {

            int max = 0;

            for (int i = 0; i <= LastUnsortedIndex; i++) {

                if (arr[i] > arr[max]) {
                    max = i;
                }
            }

            swap(arr, max, LastUnsortedIndex);

        }


        for (int value : arr) {
            System.out.println(value);
        }

    }

    public static void swap(int[] arr, int indexI, int indexJ) {
        if (indexI == indexJ) {
            return;
        }
        int temp = arr[indexI];
        arr[indexI] = arr[indexJ];
        arr[indexJ] = temp;
    }
}

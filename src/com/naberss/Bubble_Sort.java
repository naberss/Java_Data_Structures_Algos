package com.naberss;

public class Bubble_Sort {

    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 547, 8, 6, 3, 1};

        for (int unsortedIndex = (arr.length - 1); unsortedIndex > 0; unsortedIndex--) {

            for (int i = 0; i < unsortedIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, (i + 1));
                }
            }

        }

        for(int value: arr){
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

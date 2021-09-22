package com.naberss;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array_Left_Rotation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Fixed Variables
        int n = scan.nextInt();
        int d = scan.nextInt();
        List<Integer> arr = new ArrayList<>(n);

        //Filling the array
        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
        }

        for (int i = 0; i < d; i++) {
            int aux = arr.get(0);

            for (int j = 0; j < arr.size() - 1; j++) {
                arr.set(j, arr.get(j + 1));
            }

            arr.set(arr.size() - 1, aux);

        }

        String out = arr.toString()
                .replace(",", "")
                .replace("[", "")
                .replace("]", "");

        System.out.println(out);

    }
}

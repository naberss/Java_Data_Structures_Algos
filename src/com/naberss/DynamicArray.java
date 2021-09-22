package com.naberss;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> answers = new ArrayList<>();
        int lastAnswer = 0;

        //Initializing subArrays
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        int q = scan.nextInt();

        for (int i = 0; i < q; i++) {

            int id = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            int idx = ((x ^ lastAnswer) % n);

            if (id == 1) {
                arr.get(idx).add(y);
            } else if (id == 2) {
                lastAnswer = arr.get(idx).get(y % arr.get(idx).size());
                answers.add(lastAnswer);
            }
        }

        for (Integer answer : answers) {
            System.out.println(answer);
        }


    }

}

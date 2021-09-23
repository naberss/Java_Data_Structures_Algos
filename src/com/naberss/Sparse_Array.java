package com.naberss;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sparse_Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Strings Array
        int n = scan.nextInt();
        List<String> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arr.add(scan.next());
        }

        //Strings Queries
        int q = scan.nextInt();
        List<String> queries = new ArrayList<>(q);
        for (int i = 0; i < q; i++) {
            queries.add(scan.next());
        }

        List<Integer> matchCount = matchingStrings(arr, queries);

        for (Integer answer : matchCount) {
            System.out.println(answer);
        }


    }


    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {

        List<Integer> aux = new ArrayList<>(queries.size());

        for (int i = 0; i < queries.size(); i++) {
            int qCount = 0;
            for (int j = 0; j < strings.size(); j++) {
                if (queries.get(i).equalsIgnoreCase(strings.get(j))) {
                    qCount++;
                }
            }
            aux.add(qCount);
        }

        return aux;
    }


}
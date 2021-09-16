package com.naberss;

import java.util.ArrayList;
import java.util.List;

public class Arrays_DS {

    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>(List.of(1, 2, 3));
        mylist = reverseArray(mylist);
        System.out.println(mylist);


    }

    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> aux = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            aux.add(a.get( (a.size() - 1) - i));
        }
        return aux;
    }

}


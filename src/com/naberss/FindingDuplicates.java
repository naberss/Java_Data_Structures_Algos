package com.naberss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindingDuplicates {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>(List.of(1,1,2,2,9, 9, 9));
        Set<Integer> mySetAux = new HashSet<>();
        int Maincount = 0;
        for (int i = 0; i < myList.size(); i++) {
            int subCount = 0;
            for (int j = 0; j < myList.size(); j++) {
                if (i != j) {
                    if (myList.get(j) == myList.get(i)) {
                        subCount++;
                    }
                    if (subCount == 1 && !mySetAux.contains(myList.get(j))) {
                        Maincount++;
                        mySetAux.add(myList.get(j));
                    }
                }
            }


        }

        System.out.println(Maincount);

    }

    public static int countDuplicate(List<Integer> numbers) {
        int Maincount = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int subCount = 0;
            for (int j = 1; j < numbers.size() - 1; j++) {
                if (numbers.get(j) == numbers.get(i)) {
                    subCount++;
                }
                if (subCount == 2) {
                    Maincount++;
                }
            }
        }
        return Maincount;

    }
}

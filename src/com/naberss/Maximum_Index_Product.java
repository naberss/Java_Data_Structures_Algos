package com.naberss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Maximum_Index_Product {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(5, 4, 3, 4, 5));
        System.out.println(solve(arr));


    }

    public static int solve(List<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int aux = 0;
            int sign = 0;
            if (i != 0 || i != arr.size() - 1) {

                //left(i)
                for (int j = i - 1; j >= 0; j--) {
                    if (arr.get(j) > arr.get(i)) {
                        aux = (j + 1);
                        sign++;
                        break;
                    }
                }

                if (sign != 0) {

                    //right(i)
                    for (int j = i + 1; j < arr.size(); j++) {
                        if (arr.get(j) > arr.get(i)) {
                            aux = aux * (j + 1);
                            if (aux > max) {
                                max = aux;
                            }
                            break;
                        }
                    }


                }
            }
        }
        return max;
    }

}
package com.naberss;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Plus_Minus {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>(List.of(1, 1, 0, -1, -1));

        plusMinus(arr);

    }

    public static void plusMinus(List<Integer> arr) {
        double positive = 0.0;
        double negative = 0.0;
        double zero = 0.0;

        for (Integer var : arr) {
            if (var > 0) {
                positive++;
            } else if (var == 0) {
                zero++;
            } else {
                negative++;
            }
        }

        System.out.println(String.format("%.6f", (positive / arr.size())));
        System.out.println(String.format("%.6f", (negative / arr.size())));
        System.out.println(String.format("%.6f", (zero / arr.size())));

    }


}

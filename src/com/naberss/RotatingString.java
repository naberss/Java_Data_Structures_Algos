package com.naberss;

import java.util.Arrays;

public class RotatingString {

    public static void main(String[] args) {

        String s = "ABCDE";
        System.out.println(getShiftedString("ABCDE",1,1));
    }

    public static String getShiftedString(String s, int leftShifts, int rightShifts) {
        String mod = "";
        String[] arr = s.split("");
        //Left Shift
        for (int i = 0; i < leftShifts; i++) {
            String Aux = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = Aux;
        }

        //Right Shift
        for (int i = 0; i < rightShifts; i++) {
            String Aux = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = Aux;
        }

        for (String str : arr) {
            mod += str;
        }


        return mod;
    }
}

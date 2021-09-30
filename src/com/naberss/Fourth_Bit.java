package com.naberss;

public class Fourth_Bit {

    public static void main(String[] args) {

        System.out.println(fourthBit(23));

    }

    public static int fourthBit(int base10) {
        String base2 = Integer.toBinaryString(base10);
        String[] arr = base2.split("");
        String newString = arr[arr.length - 4];


        return Integer.parseInt(newString, 2);


    }
}

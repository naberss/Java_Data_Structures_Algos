package com.naberss;

public class ReversingBinaryIntegers {
    public static void main(String[] args) {
        System.out.println(changeAds(30));

    }

    public static int changeAds(int base10) {
        String base2 = Integer.toBinaryString(base10);
        String[] arr = base2.split("");
        String newString = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("1")) {
                arr[i] = "0";
            } else {
                arr[i] = "1";
            }

            newString += arr[i];
        }
        System.out.println(base2);
        System.out.println(newString);

        return Integer.parseInt(newString, 2);


    }

}

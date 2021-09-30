package com.naberss;

public class Password_Creation {
    public static void main(String[] args) {

        System.out.println(newPassword("abc","def"));


    }

    public static String newPassword(String a, String b) {

        String C = "";

        String arrA[] = a.split("");
        String arrB[] = b.split("");

        int MaxIndexA = (arrA.length - 1);
        int MaxIndexB = (arrB.length - 1);
        int MaxIndexC = (arrA.length + arrB.length);

        int auxA = 0;
        int auxB = 0;


        for (int i = 0; i <= MaxIndexC; i++) {
                if (auxA <= MaxIndexA && auxB <= MaxIndexB) {
                    if (i % 2 == 0) {
                        C += arrA[auxA];
                        auxA++;
                    } else {
                        C += arrB[auxB];
                        auxB++;
                    }
                } else if (auxA <= MaxIndexA) {
                    C += arrA[auxA];
                    auxA++;
                } else if (auxB <= MaxIndexB) {
                    C += arrB[auxB];
                    auxB++;
                }
        }


        return C;

    }
}

package com.naberss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Array_2D_DS {

    public static void main(String[] args) {

        //creates matrix skeleton
        int vertexCount = 6;
        List<List<Integer>> arr = new ArrayList<>(vertexCount);

        //creates subarray skeleton
        /*arr = (ArrayList) arr.stream().map(ArrayList::new).collect(Collectors.toList());*/

        for (int i = 0; i < vertexCount; i++) {
            arr.add(new ArrayList());
        }

        System.out.println(arr);

        //fill first column of the matrix
        arr.get(0).add(1);
        arr.get(1).add(0);
        arr.get(2).add(1);
        arr.get(3).add(0);
        arr.get(4).add(0);
        arr.get(5).add(0);

        //fill second column of the matrix
        arr.get(0).add(1);
        arr.get(1).add(1);
        arr.get(2).add(1);
        arr.get(3).add(0);
        arr.get(4).add(0);
        arr.get(5).add(0);

        //fill third column of the matrix
        arr.get(0).add(1);
        arr.get(1).add(0);
        arr.get(2).add(1);
        arr.get(3).add(2);
        arr.get(4).add(0);
        arr.get(5).add(1);

        //fill fourth column of the matrix
        arr.get(0).add(0);
        arr.get(1).add(0);
        arr.get(2).add(0);
        arr.get(3).add(4);
        arr.get(4).add(2);
        arr.get(5).add(2);

        //fill fifth column of the matrix
        arr.get(0).add(0);
        arr.get(1).add(0);
        arr.get(2).add(0);
        arr.get(3).add(4);
        arr.get(4).add(0);
        arr.get(5).add(4);

        //fill sixth column of the matrix
        arr.get(0).add(0);
        arr.get(1).add(0);
        arr.get(2).add(0);
        arr.get(3).add(0);
        arr.get(4).add(0);
        arr.get(5).add(0);

        System.out.println(arr);
        System.out.println(hourglassSum(arr));

    }

    public static int hourglassSum(List<List<Integer>> arr) {
        List<Integer> sum = new ArrayList<>();
        int hg = 0;

        /*1-1*/
        //topside
        hg = arr.get(0).get(0);
        hg += arr.get(0).get(1);
        hg += arr.get(0).get(2);
        //midside
        hg += arr.get(1).get(1);
        //botside
        hg +=  arr.get(2).get(0);
        hg += arr.get(2).get(1);
        hg += arr.get(2).get(2);
        sum.add(hg);


        /*1-2*/
        //topside
        hg = arr.get(0).get(1);
        hg += arr.get(0).get(2);
        hg += arr.get(0).get(3);
        //midside
        hg += arr.get(1).get(2);
        //botside
        hg +=  arr.get(2).get(1);
        hg += arr.get(2).get(2);
        hg += arr.get(2).get(3);
        sum.add(hg);

        /*1-3*/
        //topside
        hg = arr.get(0).get(2);
        hg += arr.get(0).get(3);
        hg += arr.get(0).get(4);
        //midside
        hg += arr.get(1).get(3);
        //botside
        hg +=  arr.get(2).get(2);
        hg += arr.get(2).get(3);
        hg += arr.get(2).get(4);
        sum.add(hg);

        /*1-4*/
        //topside
        hg = arr.get(0).get(3);
        hg += arr.get(0).get(4);
        hg += arr.get(0).get(5);
        //midside
        hg += arr.get(1).get(4);
        //botside
        hg +=  arr.get(2).get(3);
        hg += arr.get(2).get(4);
        hg += arr.get(2).get(5);
        sum.add(hg);

        //---------------------------------//

        /*2-1*/
        //topside
        hg = arr.get(1).get(0);
        hg += arr.get(1).get(1);
        hg += arr.get(1).get(2);
        //midside
        hg += arr.get(2).get(1);
        //botside
        hg +=  arr.get(3).get(0);
        hg += arr.get(3).get(1);
        hg += arr.get(3).get(2);
        sum.add(hg);


        /*2-2*/
        //topside
        hg = arr.get(1).get(1);
        hg += arr.get(1).get(2);
        hg += arr.get(1).get(3);
        //midside
        hg += arr.get(2).get(2);
        //botside
        hg +=  arr.get(3).get(1);
        hg += arr.get(3).get(2);
        hg += arr.get(3).get(3);
        sum.add(hg);

        /*2-3*/
        //topside
        hg = arr.get(1).get(2);
        hg += arr.get(1).get(3);
        hg += arr.get(1).get(4);
        //midside
        hg += arr.get(2).get(3);
        //botside
        hg +=  arr.get(3).get(2);
        hg += arr.get(3).get(3);
        hg += arr.get(3).get(4);
        sum.add(hg);

        /*2-4*/
        //topside
        hg = arr.get(1).get(3);
        hg += arr.get(1).get(4);
        hg += arr.get(1).get(5);
        //midside
        hg += arr.get(2).get(4);
        //botside
        hg +=  arr.get(3).get(3);
        hg += arr.get(3).get(4);
        hg += arr.get(3).get(5);
        sum.add(hg);

        //---------------------------------//

        /*3-1*/
        //topside
        hg = arr.get(2).get(0);
        hg += arr.get(2).get(1);
        hg += arr.get(2).get(2);
        //midside
        hg += arr.get(3).get(1);
        //botside
        hg +=  arr.get(4).get(0);
        hg += arr.get(4).get(1);
        hg += arr.get(4).get(2);
        sum.add(hg);


        /*3-2*/
        //topside
        hg = arr.get(2).get(1);
        hg += arr.get(2).get(2);
        hg += arr.get(2).get(3);
        //midside
        hg += arr.get(3).get(2);
        //botside
        hg +=  arr.get(4).get(1);
        hg += arr.get(4).get(2);
        hg += arr.get(4).get(3);
        sum.add(hg);

        /*3-3*/
        //topside
        hg = arr.get(2).get(2);
        hg += arr.get(2).get(3);
        hg += arr.get(2).get(4);
        //midside
        hg += arr.get(3).get(3);
        //botside
        hg +=  arr.get(4).get(2);
        hg += arr.get(4).get(3);
        hg += arr.get(4).get(4);
        sum.add(hg);

        /*3-4*/
        //topside
        hg = arr.get(2).get(3);
        hg += arr.get(2).get(4);
        hg += arr.get(2).get(5);
        //midside
        hg += arr.get(3).get(4);
        //botside
        hg +=  arr.get(4).get(3);
        hg += arr.get(4).get(4);
        hg += arr.get(4).get(5);
        sum.add(hg);

//---------------------------------//

        /*4-1*/
        //topside
        hg = arr.get(3).get(0);
        hg += arr.get(3).get(1);
        hg += arr.get(3).get(2);
        //midside
        hg += arr.get(4).get(1);
        //botside
        hg +=  arr.get(5).get(0);
        hg += arr.get(5).get(1);
        hg += arr.get(5).get(2);
        sum.add(hg);


        /*4-2*/
        //topside
        hg = arr.get(3).get(1);
        hg += arr.get(3).get(2);
        hg += arr.get(3).get(3);
        //midside
        hg += arr.get(4).get(2);
        //botside
        hg +=  arr.get(5).get(1);
        hg += arr.get(5).get(2);
        hg += arr.get(5).get(3);
        sum.add(hg);

        /*4-3*/
        //topside
        hg = arr.get(3).get(2);
        hg += arr.get(3).get(3);
        hg += arr.get(3).get(4);
        //midside
        hg += arr.get(4).get(3);
        //botside
        hg +=  arr.get(5).get(2);
        hg += arr.get(5).get(3);
        hg += arr.get(5).get(4);
        sum.add(hg);

        /*4-4*/
        //topside
        hg = arr.get(3).get(3);
        hg += arr.get(3).get(4);
        hg += arr.get(3).get(5);
        //midside
        hg += arr.get(4).get(4);
        //botside
        hg +=  arr.get(5).get(3);
        hg += arr.get(5).get(4);
        hg += arr.get(5).get(5);
        sum.add(hg);
        return sum.stream().max(Integer::compare).get();
    }


}

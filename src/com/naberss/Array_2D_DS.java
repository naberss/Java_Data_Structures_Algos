package com.naberss;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Array_2D_DS {

    public static void main(String[] args) {

        //creates matrix skeleton
        int vertexCount = 2;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(vertexCount);

        //creates subarray skeleton
        /*graph = (ArrayList) graph.stream().map(ArrayList::new).collect(Collectors.toList());*/

        for (int i = 0; i < vertexCount; i++) {
            graph.add(new ArrayList());
        }

        System.out.println(graph);

        //fill first column of the matrix
        graph.get(0).add(1);
        graph.get(1).add(7);

        //fill second column of the matrix
        graph.get(0).add(2);
        graph.get(1).add(9);

        //fill third column of the matrix
        graph.get(0).add(4);
        graph.get(1).add(6);

        //fill fourth column of the matrix
        graph.get(0).add(8);
        graph.get(1).add(5);

        System.out.println(graph);

        //Initialializing array
        ArrayList<ArrayList<Integer>> topSide = new ArrayList<>();
        for (int i = 0; i < (graph.get(0).size() - 2); i++) {
            topSide.add(new ArrayList());
        }

        //loop by Main Array index count
        for (int i = 0; i < vertexCount; i++) {
            System.out.println(graph.get(i));

            int start = -1;
            int end = 3;
            Integer topIndex = 0;

            //topside array begin composition
            for (int j = 0; j < end; j++) {
                topSide.get(topIndex).add(graph.get(i).get(j));

                if (j == start + 3 && j + 1 < graph.get(i).size()) {
                    j = start + 1;
                    start++;
                    end++;
                    topIndex++;
                }

            }
            System.out.println(topSide);
            //topside array end composition

        }


    }

    /*public static int hourglassSum(List<List<Integer>> arr) {
        //code here
        return 0;
    }*/


}

package org.fasttrackit.code.homework.algorithm;

public class Main {
    public static void main(String[] args) {
        Integer[][] arrays = {{1, 2, 3}, {5, 1, 2}};
        Integer[] maxOfArrays = new Integer[arrays.length];

        for (int i = 0; i < arrays.length; i++) {
            int maxInsideArray = 0;
            for (int j = 0; j < arrays[i].length; j++) {
                if (arrays[i][j] > maxInsideArray) {
                    maxInsideArray = arrays[i][j];
                }
            }
            maxOfArrays[i] = maxInsideArray;
        }

        for(Integer max: maxOfArrays){
            System.out.println(max);
        }
        int minOfMax = maxOfArrays[0];
        for (int i = 0; i < maxOfArrays.length; i++) {
            if(maxOfArrays[i]< minOfMax){
                minOfMax = maxOfArrays[i];
            }
        }

        System.out.println(minOfMax);
    }
}

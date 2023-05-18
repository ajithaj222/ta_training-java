package com.epam.training.ajith_vangara;

import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array){

        //put your code here
        boolean[] sumCheckArray = new boolean[array.length];
        sumCheckArray[0] = false;
        sumCheckArray[1] = false;

        for (int i = 2; i < array.length; i++) {
            int sum = array[i - 1] + array[i - 2];
            sumCheckArray[i] = (array[i] == sum);
        }

        return sumCheckArray;

    }
}


package com.epam.training.ajith_vangara;
import java.util.*;

public class MaxMethod {
    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] vals = new int[]{-2, 0, 10, 5};
        int result = MaxMethod.max(vals);
        System.out.println(result == 10); // true
    }
}



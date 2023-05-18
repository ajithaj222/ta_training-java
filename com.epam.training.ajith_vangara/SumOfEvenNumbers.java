package com.epam.training.ajith_vangara;

public class SumOfEvenNumbers {
    public static int sum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] vals = new int[]{-2, 10, 0, 5};
        int result = SumOfEvenNumbers.sum(vals);
        System.out.println(result == 8); // true
    }
}


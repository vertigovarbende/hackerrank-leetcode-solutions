package hackerrank.algorithms.plusMinus;

import java.util.List;

public class SolutionV1 {

    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        double positive = 0;
        double negative = 0;
        double zero = 0;
        for (int value : arr) {
            if (value > 0) {
                ++positive;
            } else if (value < 0) {
                ++negative;
            } else {
                ++zero;
            }
        }
        System.out.println((positive / n) + " ");
        System.out.println((negative / n) + " ");
        System.out.println((zero / n) + " ");
    }

}

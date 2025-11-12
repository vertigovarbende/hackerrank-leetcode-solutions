package hackerrank.algorithms.diagonalDifference;

import java.util.List;

public class SolutionV1 {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sumOfPrimaryDiagonal = 0;
        int sumOfSecondaryDiagonal = 0;
        int count = arr.size() - 1;

        for (int i = 0; i < arr.size(); ++i) {
            for (int j = 0; j < arr.size(); ++j) {
                if (i == j) {
                    sumOfPrimaryDiagonal += arr.get(i).get(j);
                }
                if (j - i == count) {
                    count -= 2;
                    sumOfSecondaryDiagonal += arr.get(i).get(j);
                }
            }
        }
        return Math.abs(sumOfPrimaryDiagonal - sumOfSecondaryDiagonal);
    }
}

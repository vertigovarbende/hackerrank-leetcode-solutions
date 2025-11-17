package hackerrank.algorithms.divisibleSumPairs;

import java.util.List;

public class SolutionV1 {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // i didn't like this solution
        // O(n^2)
        int pairsCount = 0;
        for (int i = 0; i < ar.size() - 1; ++i) {
            for (int j = 1; j < ar.size(); ++j) {
                if (i < j) {
                    if ((ar.get(i) + ar.get(j)) % k == 0) {
                        ++pairsCount;
                    }
                }
            }
        }
        return pairsCount;
    }
}

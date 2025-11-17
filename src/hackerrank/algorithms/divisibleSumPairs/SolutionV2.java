package hackerrank.algorithms.divisibleSumPairs;

import java.util.List;

public class SolutionV2 {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        int[] remainders = new int[k];
        for (int i = 0; i < n; ++i) {
            int currentRemainder = ar.get(i) % k;
            if (currentRemainder < 0) {
                currentRemainder += k;
            }
            int complement = (k - currentRemainder) % k;
            count += remainders[complement];
            remainders[currentRemainder]++;
        }
        return count;
    }

}

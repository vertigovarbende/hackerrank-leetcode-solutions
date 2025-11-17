package hackerrank.algorithms.simpleArraySum;

import java.util.List;

public class SolutionV2 {

    public static int simpleArraySum(List<Integer> ar) {
        return ar.stream().mapToInt(x -> x).sum();
    }
}

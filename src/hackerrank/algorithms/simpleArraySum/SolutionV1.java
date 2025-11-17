package hackerrank.algorithms.simpleArraySum;

import java.util.List;

public class SolutionV1 {

    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }
        return sum;
    }
}

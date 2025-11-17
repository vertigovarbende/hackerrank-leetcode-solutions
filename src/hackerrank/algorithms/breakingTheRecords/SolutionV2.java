package hackerrank.algorithms.breakingTheRecords;

import java.util.Arrays;
import java.util.List;

public class SolutionV2 {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int min = scores.get(0);
        int max = scores.get(0);

        int minRecord = 0;
        int maxRecord = 0;

        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) < min) {
                min = scores.get(i);
                minRecord++;
            } else if (scores.get(i) > max) {
                max = scores.get(i);
                maxRecord++;
            }
        }
        return Arrays.asList(maxRecord, minRecord);

    }
}

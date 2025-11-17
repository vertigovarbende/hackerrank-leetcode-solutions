package hackerrank.algorithms.breakingTheRecords;

import java.util.ArrayList;
import java.util.List;

public class SolutionV1 {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> scoreOutput = new ArrayList<Integer>();
        scoreOutput.add(0);
        scoreOutput.add(0);
        int currentMaxScore = scores.get(0);
        int currentMinScore = scores.get(0);
        for (int i = 1; i < scores.size(); ++i) {
            if (scores.get(i) < currentMinScore) {
                currentMinScore = scores.get(i);
                scoreOutput.set(1, scoreOutput.get(1) + 1);
            } else if (scores.get(i) > currentMaxScore) {
                currentMaxScore = scores.get(i);
                scoreOutput.set(0, scoreOutput.get(0) + 1);
            }
        }
        return scoreOutput;
    }
}

package hackerrank.algorithms.compareTheTriplets;

import java.util.ArrayList;
import java.util.List;

public class SolutionV1 {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;
        
        for (int i = 0; i < a.size(); ++i) {
            if (a.get(i) == b.get(i)) {
                continue;
            }
            else if (a.get(i) > b.get(i)) {
                ++aliceScore;
            } else if (a.get(i) < b.get(i)) {
                ++bobScore;
            } 
        }
        List<Integer> scores = new ArrayList<Integer>();
        scores.add(aliceScore);
        scores.add(bobScore);
        return scores;
    }
}

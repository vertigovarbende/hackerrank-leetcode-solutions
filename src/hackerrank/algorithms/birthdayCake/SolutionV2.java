package hackerrank.algorithms.birthdayCake;

import java.util.Collections;
import java.util.List;

public class SolutionV2 {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int count = 0;
        int max = Collections.max(candles); // 3
        for (int i = 0; i < candles.size(); ++i) {
            if (max == candles.get(i)) {
                ++count;
            }
        }
        return count;
    }
}

package hackerrank.algorithms.appleAndOrange;

import java.util.ArrayList;
import java.util.List;

public class SolutionV1 {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        List<Integer> count = new ArrayList<Integer>();
        count.add(0);
        count.add(0);
        for (int i = 0; i < apples.size(); ++i) {
            apples.set(i, apples.get(i) + a);
            if (apples.get(i) >= s && apples.get(i) <= t) {
                count.set(0, count.get(0) + 1);
            }
        }

        for (int i = 0; i < oranges.size(); ++i) {
            oranges.set(i, oranges.get(i) + b);
            if (oranges.get(i) >= s && oranges.get(i) <= t) {
                count.set(1, count.get(1) + 1);
            }
        }

        System.out.println(count.get(0));
        System.out.println(count.get(1));
    }

}

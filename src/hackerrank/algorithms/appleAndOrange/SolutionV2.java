package hackerrank.algorithms.appleAndOrange;

import java.util.List;

public class SolutionV2 {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        long countApples = apples.stream()
                .map(apple -> apple + a)
                .filter(pos -> pos >= s && pos <= t)
                .count();

        long countOranges = oranges.stream()
                .map(orange -> orange + b)
                .filter(pos -> pos >= s && pos <= t)
                .count();

        System.out.println(countApples + "\n" + countOranges);
    }
}

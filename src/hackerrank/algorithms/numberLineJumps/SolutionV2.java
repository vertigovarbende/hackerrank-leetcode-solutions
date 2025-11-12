package hackerrank.algorithms.numberLineJumps;

public class SolutionV2 {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 <= v2) {
            return "NO";
        }
        // x = v * t
        // t = x / v
        // x % v == 0
        if ((x2 - x1) % (v1 - v2) == 0) {
            return "YES";
        }
        return "NO";
    }

}

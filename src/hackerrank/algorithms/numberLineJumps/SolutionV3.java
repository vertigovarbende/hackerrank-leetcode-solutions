package hackerrank.algorithms.numberLineJumps;

public class SolutionV3 {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // if x2 > x1 then v1 > v2
        // otherwise the kangaroos will never catch each other
        if (v2 >= v1) {
            return "NO";
        }

        // v1 * jumpCount + x1 = v2 * jumpCount + x2
        // jumpCount(v1 - v2) = x2 - x1
        // jumpCount = (x2 - x1) / (v1 - v2)
        // (x2 - x1) % (v1 - v2) == 0
        // (jumpCount = (x2 - x1) / (v1 - v2)) >= 0

        int dx = x2 - x1;
        int dv = v1 - v2;

        if (dx % dv == 0 && dx / dv >= 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

}

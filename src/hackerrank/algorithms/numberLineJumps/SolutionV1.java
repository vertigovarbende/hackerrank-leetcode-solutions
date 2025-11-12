package hackerrank.algorithms.numberLineJumps;

public class SolutionV1 {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // if x2 > x1 then v1 > v2
        // if x1 > x2 then v2 > v1
        // otherwise the kangaroos will never catch each other

        // TEST CASE - 13/30

        if (v2 >= v1) {
            return "NO";
        }
        int i = 1;
        while (true) {
            if ((v1 * i) +x1 == (v2 * i) + x2) {
                return "YES";
            }
            ++i;
        }
    }
}

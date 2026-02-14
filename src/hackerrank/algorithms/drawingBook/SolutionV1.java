package hackerrank.algorithms.drawingBook;

public class SolutionV1 {

    public static int pageCount(int n, int p) {

        int fromFront = p / 2;
        int fromBack = (n / 2) - (p / 2);

        /*
        if (fromFront < fromBack)
            return fromFront;
        else
            return fromBack;
        */
        return Math.min(fromFront, fromBack);

    }

}

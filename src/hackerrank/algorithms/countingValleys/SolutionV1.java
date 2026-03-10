package hackerrank.algorithms.countingValleys;


public class SolutionV1 {

    public static int countingValleys(int steps, String path) {

        int countOfValleys = 0;
        int seaLevel = 0;

        for (int i = 0; i < steps; i++) {
            char step = path.charAt(i);
            if (step == 'U') {
                seaLevel++;
                if (seaLevel == 0) {
                    countOfValleys++;
                }
            } else if (step == 'D') {
                seaLevel--;
            }
        }

        return countOfValleys;

    }


}

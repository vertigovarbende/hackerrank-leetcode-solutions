package hackerrank.algorithms.electronicsShop;

public class SolutionV1 {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        // bad solution

        int afford = keyboards[0] + drives[0];
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                if (afford < keyboard + drive && keyboard + drive <= b)
                    afford = keyboard + drive;
                 else
                    afford = -1;
            }
        }
        return afford; // 9/16 test case failed

    }



}

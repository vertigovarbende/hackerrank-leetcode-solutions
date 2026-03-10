package hackerrank.algorithms.electronicsShop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionV2 {

    // ???
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        List<Integer> keyboardList = new ArrayList<>(Arrays
                .stream(keyboards)
                .boxed()
                .toList());
        keyboardList.sort(Collections.reverseOrder());

        List<Integer> drivesList = new ArrayList<>(Arrays
                .stream(drives)
                .boxed()
                .toList());
        drivesList.sort(Collections.reverseOrder());

        int max = -1;
        for (Integer keyboard : keyboardList) {
            for (Integer drive : drivesList) {
                if (keyboard + drive > b)
                    break;
                if (keyboard + drive > max)
                    max = keyboard + drive;
            }
        }
        return max;
    }

}

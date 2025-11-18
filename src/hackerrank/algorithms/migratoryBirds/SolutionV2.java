package hackerrank.algorithms.migratoryBirds;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionV2 {

    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> occursMap = new HashMap<>();

        for (int typeId : arr) {
            if (occursMap.containsKey(typeId)) {
                occursMap.put(typeId, occursMap.get(typeId) + 1);
            }  else {
                occursMap.put(typeId, 1);
            }
        }

        int maxKey = 0;
        int maxValue = 0;

        for (int key : occursMap.keySet()) {
            if (occursMap.get(key) > maxValue) {
                maxKey = key;
                maxValue = occursMap.get(key);
            }
        }
        return maxKey;
    }
}

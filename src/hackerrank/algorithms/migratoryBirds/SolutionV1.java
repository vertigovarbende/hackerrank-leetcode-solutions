package hackerrank.algorithms.migratoryBirds;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionV1 {

    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> occursMap = new HashMap<>();
        for (int i = 0; i < arr.size(); ++i) {
            int key = arr.get(i);
            if (occursMap.containsKey(key)) {
                occursMap.put(key, occursMap.get(key) + 1);
            } else {
                occursMap.put(key, 1);
            }
        }
        return occursMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
    }

}

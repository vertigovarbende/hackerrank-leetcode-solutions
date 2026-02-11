package hackerrank.algorithms.salesByMatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SolutionV1 {

    // 1-) unique olanları bir listeye atıp, her birinin sayılarını 2 bölme falan
    // 2-) bunları hashmap'e atıp tekrar 2 ye bölme falan
    // 3-) sort mantığı

    // daha basiti kesin var
    public static int sockMerchant(int n, List<Integer> ar) {

       Map<Integer, Integer> socksMap = new HashMap<>();
       for (int sock: ar) {
           if (socksMap.containsKey(sock)) {
               socksMap.put(sock, socksMap.get(sock) + 1);
           } else {
               socksMap.put(sock, 1);
           }
       }
       int countOfPairs = 0;
       for (int value: socksMap.values()) {
           if (value % 2 == 0) {
               countOfPairs += value / 2;
           } else if (value % 2 == 1) {
               countOfPairs += (value - 1) / 2;
           }
       }
       return countOfPairs;
    }



}

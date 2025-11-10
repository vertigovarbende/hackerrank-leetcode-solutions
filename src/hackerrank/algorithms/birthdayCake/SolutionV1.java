package hackerrank.algorithms.birthdayCake;

import java.util.List;

public class SolutionV1 {

	public static int cake(List<Integer> candles) {
		int count = 0;
		int max = findTheMax(candles);
		for (int i = 0; i < candles.size(); ++i) {
			if (max == candles.get(i))
				++count;
		}
		return count;
	}
	
	public static int findTheMax(List<Integer> candles) {
		int max = candles.get(0);
		for (int i = 0; i < candles.size(); ++i) {
			if (max < candles.get(i)) {
				max = candles.get(i);
			}
		}
		return max;
	}
}



package hackerrank.algorithms.gradingStudents;

import java.util.ArrayList;
import java.util.List;

public class SolutionV1 {

	public static List<Integer> gradingStudents(List<Integer> grades) {
        
	    int mod = 0;
	    List<Integer> newGrades = new ArrayList<Integer>();
	    for (int i = 0; i < grades.size(); ++i) {
	        mod = grades.get(i) % 5;
	        if (grades.get(i) < 38) {
	            newGrades.add(grades.get(i));
	        } else if (mod == 4) {
	            newGrades.add(grades.get(i) + 1);
	        } else if (mod == 3) {
	            newGrades.add(grades.get(i) + 2);
	        } else {
	            newGrades.add(grades.get(i));
	        }
	    }
	  
	        return newGrades;
	}
}

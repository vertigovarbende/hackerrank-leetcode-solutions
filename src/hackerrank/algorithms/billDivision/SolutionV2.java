package hackerrank.algorithms.billDivision;

import java.util.List;

public class SolutionV2 {

    public static void bonAppetit(List<Integer> bill, int k, int b) {

        int totalBill = bill.stream().mapToInt(x -> x).sum();
        int fairly = (totalBill - bill.get(k)) / 2;
        if (fairly == b) {
            System.out.println("Bon Appetit");
        } else if (totalBill / 2 == b) {
            System.out.println((totalBill / 2) - fairly);
        }

    }

}

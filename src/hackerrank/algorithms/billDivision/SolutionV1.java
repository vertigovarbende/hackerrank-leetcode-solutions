package hackerrank.algorithms.billDivision;

import java.util.List;

public class SolutionV1 {

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int totalBill = 0;
        for (int value: bill) {
            totalBill += value;
        }
        int fairly = (totalBill - bill.get(k)) / 2;
        if (fairly == b) {
            System.out.println("Bon Appetit");
        } else if (totalBill / 2 == b) {
            System.out.println((totalBill / 2) - fairly);
        }
    }
}

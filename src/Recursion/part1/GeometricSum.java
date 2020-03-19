package Recursion.part1;

public class GeometricSum {

    public static double findSum(int k) {
        if (k == 0) {
            return 1;
        }
        double sum = (double) (1 / Math.pow(2, k));
        return sum + findSum(k - 1);
    }
}
// if k = 3 ----> 1 + 1 /2.power(1)  + 1/ 2.power(2) + 1/2.power(3)
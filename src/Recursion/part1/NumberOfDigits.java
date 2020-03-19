package Recursion.part1;

public class NumberOfDigits {

    static int digits(int num) {
        if (num == 0) {
            return 0;
        }
        int smallAns = digits(num / 10);
        return 1 + smallAns ;
    }
}

package Recursion.part1;

public class SumOfDigits {

    public static int sum(int num) {
        if(num < 10) {
            return num;
        }
        int digit = num % 10;
        return digit + sum(num / 10);
    }
}

package Recursion.part1;

public class NthFibonacciNumber {

    static int fibo(int num) {

        if (num == 1 || num == 0) {
            return num;
        }
        int a = fibo(num - 1);
        int b = fibo(num - 2);
        return a + b;

    }
}

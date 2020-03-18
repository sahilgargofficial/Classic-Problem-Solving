package Recursion;

public class DriverClass {

    DriverClass() {
        System.out.println("Launching Driver class of Recursion");
    }

    public static void main(String[] args) {
        int fact = Factorial.factorial(2);
        System.out.println(fact);

        // Sum of N Natural Numbers
        int sum = SumOfNaturalNumber.sum(3);
        System.out.println(sum);

        // Power of a Number
        int power = CalculatePower.power(2, 2);
        System.out.println(power);

        // Print Number from 1 to N
        PrintNNaturalNumber.print(5);
        System.out.println();

        // Number of Digits
        int digits = NumberOfDigits.digits(85689456);
        System.out.println(digits);

        // Nth Fibonacci number
        int fibonacci = NthFibonacciNumber.fibo(5);
        System.out.println(fibonacci);
    }

}

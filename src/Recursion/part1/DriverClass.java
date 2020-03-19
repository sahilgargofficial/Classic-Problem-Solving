package Recursion.part1;

public class DriverClass {

    DriverClass() {
        System.out.println("Launching Driver class of Recursion");
    }

    public static void main(String[] args) {
        int fact = Factorial.factorial(2);
        System.out.println("Factorial of Number  " + fact);

        // Sum of N Natural Numbers
        int sum = SumOfNaturalNumber.sum(3);
        System.out.println("Sum of N Natural Number  " + sum);

        // Power of a Number
        int power = CalculatePower.power(2, 2);
        System.out.println("Calc Power of a Number  " + power);

        // Print Number from 1 to N
        System.out.print("Printing Number from 1 to N  ");
        PrintNNaturalNumber.print(5);
        System.out.println();

        // Number of Digits
        int digits = NumberOfDigits.digits(85689456);
        System.out.println("Number of digits in the Given Number  " + digits);

        // Nth Fibonacci number
        int fibonacci = NthFibonacciNumber.fibo(5);
        System.out.println("Nth Fibonacci Number  " + fibonacci);

        // Check If Array is Sorted
        boolean isSorted = checkSorted.sort(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 15});
        System.out.println("Array is Sorted  " + isSorted);

        // Sum of all Elements in Array
        int sumArray = sumOfArray.sum(new int[]{1, 2, 3, 4});
        System.out.println("Sum of Array  " + sumArray);

        // Check Element in Array
        boolean isPresent = checkNumberInArray.check(new int[]{1, 2, 3, 4, 5, 6, 8, 52, 6, 565, 23, 0}, 879);
        System.out.println("Number is Present  " + isPresent);

        // Find 1st Index of a Number in Array
        int index = FirstIndexOfNumber.findIndex(new int[]{1, 2, 3, 4, 5, 6, 9, 8, 7, 7, 7, 5}, 32);
        System.out.println("First Index of Num is " + index);

        // Last Index of a Number in Array
        int lastIndex = LastIndexOfNumber.lastIndex(new int[]{1, 2, 3, 4, 5, 6, 9, 8, 7, 7, 7, 5, 4}, 7);
        System.out.println("Last Index of a Number is " + lastIndex);

        // All Indices of a Number
        int[] indices = AllIndicesOfNumber.allIndices(new int[]{1, 2, 3, 4, 4, 5, 6, 7, 8, 4, 9, 8}, 4);
        System.out.print("Indices of a no in Array  ");
        for (int i : indices) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Multiply  2 Numbers using ( +  or  -) operators recursively
        System.out.println("Result of Multiplication is  " + MultiplicationRecursive.multiply(5 , 3));

        // Count Number of Zeros in a Number
        System.out.println("Number of Zeros are  " + CountZeros.count(10240));

        // Find Geometric Sum till Kth number power
        System.out.println("Geometric sum is  " + GeometricSum.findSum(3));

        // check given String is Palindrome or not
        System.out.println("String is Palindrome:  " + checkPalindrome.check("sos"));

        // Sum of All Digits in a number
        System.out.println("Sum of Digits are  " + SumOfDigits.sum(0));
    }

}

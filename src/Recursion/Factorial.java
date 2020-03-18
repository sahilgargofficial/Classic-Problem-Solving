package Recursion;

public class Factorial {

    static int factorial(int num) {
        /*
        If Base Case is not defined then the recursion will run infinitely and thus every time when recursion will run
        there will a entry in the Internal Stack and at some point of time we will get error as StackOverFlow Exception
        thus its very important to define base case
         */
        if (num == 0) {
            return 1;
        }
        int smallAns = factorial(num - 1);
        return num * smallAns;
    }
}

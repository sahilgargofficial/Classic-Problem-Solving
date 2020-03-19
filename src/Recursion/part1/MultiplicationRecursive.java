package Recursion.part1;

public class MultiplicationRecursive {

    public static int multiply(int a , int b) {
        if (a == 0){
            return 0;
        }
        return b + multiply(a - 1 , b);
    }
}

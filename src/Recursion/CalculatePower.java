package Recursion;

public class CalculatePower {

    static int power(int num , int pow) {
        if(pow == 0) {
            return 1;
        }
        int smallAns = power(num , pow - 1);
        return  num * smallAns;
    }
}

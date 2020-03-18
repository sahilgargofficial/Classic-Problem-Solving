package Recursion;

public class SumOfNaturalNumber {

    static int sum(int num) {
        if(num == 0){
            return 0;
        }
        int smallAns = sum(num - 1);
        return num + smallAns;
    }
}

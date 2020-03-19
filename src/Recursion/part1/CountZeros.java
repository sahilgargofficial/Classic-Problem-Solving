package Recursion.part1;

public class CountZeros {

    public static int count(int num) {

        if (num < 10) {
            if (num % 10 == 0) {
                return 1;
            }
            return 0;
        }
        int smallAns = count(num / 10);
        if(num % 10 == 0){
            return smallAns + 1;
        }
        else {
            return smallAns;
        }

    }
}
package Recursion.part2;

public class ReturnKeypad {

    static String[] keypad(int num) {

        if(num < 10) {
            return helper(num);
        }
        String[] smallAns = keypad(num / 10);
        int lastNumber = num % 10;
        String[] join =  helper(lastNumber);
        String[] output = new String[smallAns.length * join.length];
        int k = 0;
        for (String i : smallAns){
            for (String j : join){
                output[k] = i + j;
                ++k;
            }
        }
        return output;

    }

    private  static String[] helper(int num) {

        if(num == 2) {
            return new String[]{"A" , "B" , "C"};
        }
        if(num == 3) {
            return new String[]{"D" , "E" , "F"};
        }
        else {
            return new String[]{"G" , "H" , "I"};
        }
    }
}

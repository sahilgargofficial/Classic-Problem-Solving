package Recursion.Assignment;

public class PairStar {

    static String pairStar(String input) {
        if(input.length() <= 1 ) {
            return input;
        }
        String out = pairStar(input.substring(1));
        if(input.charAt(0) == input.charAt(1)) {
            return input.charAt(0) + "*" + out;
        }
        return input.charAt(0) + out;
    }
}

package Recursion.Assignment;

public class removeX {

    static String remove(String input) {

        if (input.length() == 0) {
            return input;
        }
        String out = remove(input.substring(1));
        if (input.charAt(0) == 'x') {
            return out;
        }
        return input.charAt(0) + out;
    }
}

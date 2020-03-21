package Recursion.part2;

public class checkAB {

    static boolean check(String input) {

        if (input.length() == 0) {
            return true;
        }
        if (input.charAt(0) == 'a') {
            if (input.substring(1).length() > 1 && input.substring(1, 3).equals("bb")) {
                check(input.substring(1, 3));
            } else {
                check(input.substring(1));
            }
        }
        return false;
    }
}

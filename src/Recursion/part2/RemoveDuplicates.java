package Recursion.part2;

public class RemoveDuplicates {

    static String remove(String input) {
        if (input.length() <= 1)
            return input;
        if (input.charAt(0) == input.charAt(1)) {
            return remove(input.substring(1));
        } else {
            return input.charAt(0) + remove(input.substring(1));
        }
    }
}

package Recursion.Assignment;

public class StringToInteger {

    static int convertStringToInteger(String input) {

        if (input.length() == 1) {
            return input.charAt(0) - '0';
        }
        int smallAns = convertStringToInteger(input.substring(0, input.length() - 1));
        int lastDigit = input.charAt(input.length() - 1) - '0';
        return smallAns * 10 + lastDigit;
    }
}

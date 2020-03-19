package Recursion.part1;

public class checkPalindrome {

    public static boolean check(String input){
        return check(input , 0 , input.length() - 1);
    }

    private static boolean check(String input , int start , int end) {

        if(start == end) {
            return true;
        }
        if(input.charAt(start) == input.charAt(end)) {
            return check(input , start + 1 , end - 1);
        }
        return false;
    }
}

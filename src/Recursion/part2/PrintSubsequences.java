package Recursion.part2;

public class PrintSubsequences {

    static void subsequence(String input) {
        subsequence(input , "");
    }

    private static  void subsequence(String input , String outputSoFar) {
        if (input.length() == 0) {
            System.out.print(outputSoFar + " ");
            return;
        }
        subsequence(input.substring(1) , outputSoFar);
        subsequence(input.substring(1) , outputSoFar + input.charAt(0));
    }
}

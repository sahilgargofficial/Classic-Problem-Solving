package Recursion.part2;

public class PrintKeypadCombinations {

    static  void print(int num) {
        print(num , "");
    }
    private  static void print(int num , String outputSoFar) {
        if( num < 10) {
            System.out.println("");
            return;
        }
        print(num , outputSoFar);

    }
}

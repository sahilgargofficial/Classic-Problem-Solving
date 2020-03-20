package Recursion.Assignment;

public class Driver {

    public static void main(String[] args) {

        // Replace PI with 3.14 in a String
        System.out.println("Replace pi: " + ReplacePI.replace("xpix"));

        // Remove X from String
        System.out.println("Remove X: " + removeX.remove("abxcxxbx"));

        // Convert String to Integer
        System.out.println("String to Integer: " + StringToInteger.convertStringToInteger("158963"));

        // Pair Star
        System.out.println("Pair Star  " + PairStar.pairStar("hello"));

        // Hanoi Tower Problem
        System.out.println("Hanoi Tower :\n ");
        HanoiTower.tower(3);
        System.out.println("----------------------------------------------------");
    }
}

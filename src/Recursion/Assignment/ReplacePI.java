package Recursion.Assignment;

public class ReplacePI {

    static String replace(String input) {

        if(input.length() <= 1){
            return input;
        }
        String out =  replace(input.substring(1));
        if(input.substring(0,2).equals("pi")){
            return "3.14" + out.substring(1);
        }
        return input.charAt(0) + out;

    }
}

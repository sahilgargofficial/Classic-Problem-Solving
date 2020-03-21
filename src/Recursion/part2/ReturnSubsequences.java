package Recursion.part2;

public class ReturnSubsequences {

    static String[] sequences(String input) {
        if(input.length() == 0) {
            return new String[]{""};
        }
        String[] smallAns = sequences(input.substring(1));
        String[] ans = new String[2 * smallAns.length];
        int k = 0;
        for(int i = 0 ; i < smallAns.length; i++ , k++) {
            ans[k] = smallAns[i];
        }
        for (String smallAn : smallAns) {
            ans[k] = input.charAt(0) + smallAn;
            ++k;
        }
        return ans;

    }
}

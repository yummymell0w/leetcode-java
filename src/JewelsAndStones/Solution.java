package JewelsAndStones;

public class Solution {

    public int countChars(char c, String S) {
        char[] charsS = S.toCharArray();
        int result = 0;
        int i = 0;
        while (i < S.length()) {
            if (c == charsS[i]) {
                result++;
            }
            i++;
        }
        return result;

    }

    public int numJewelsInStones(String J, String S) {
        char[] charsJ = J.toCharArray();
        int result = 0;
        int i = 0;
        while (i < J.length()) {
            int count = countChars(charsJ[i], S);
            result= result +count;
            i++;
        }

    return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numJewelsInStones("abce", "yyyy"));

    }

}
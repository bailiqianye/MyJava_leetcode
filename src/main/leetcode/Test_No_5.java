import org.junit.jupiter.api.Test;


public class Test_No_5 {


    @Test
    public void main() {
        String s = "1221";
        System.out.println(s.charAt(3));
        //System.out.println(isPalindromic("bab1"));


    }

 /*   输入：s = "babad"
      输出："bab"

 */

    public String longestPalindrome(String s) {
        String ans = "";
        int max = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {

            for (int j = i + 1; j <= len; j++) {
                String tmp = s.substring(i, j);

                if (isPalindromic(tmp) && tmp.length() > max) {
                    ans = tmp;
                    max = j - i;
                }
            }
        }
        return ans;


    }
        //判断是否为回文数
    private static boolean isPalindromic(String s) {
        int len = s.length();

        for (int i = 0; i < len / 2; i++) {

            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;

    }
}
import org.junit.jupiter.api.Test;

public class Test_No_3 {


    @Test
    public void main() {
        String s = "abcabcbb";
        int out;
        out = lengthOfLongestSubstring(s);
        System.out.println(out);

    }


    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }

        char[] chas = s.toCharArray();
        int[] map = new int[256];


        for (int i = 0; i < 256; i++) {
            map[i] = -1;
        }



        int len = 0;
        int pre = -1;
        int cur = 0;

        for (int i = 0; i != chas.length; i++) {

            pre = Math.max(pre, map[chas[i]]);

            cur = i - pre;
            len = Math.max(len, cur);
            map[chas[i]] = i;
        }
        return len;
    }
}

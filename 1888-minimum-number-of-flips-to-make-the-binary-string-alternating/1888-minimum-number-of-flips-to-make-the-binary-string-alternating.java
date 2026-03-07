class Solution {
    public int minFlips(String s) {
        int n = s.length();
        int res = Integer.MAX_VALUE;
        int flip1 = 0;
        int flip2 = 0;

        int i = 0;
        int j = 0;

        while (j < 2 * n) {

            char exp1 = (j % 2 == 1) ? '0' : '1';
            char exp2 = (j % 2 == 1) ? '1' : '0';

            if (s.charAt(j % n) != exp1) {
                flip1++;
            }

            if (s.charAt(j % n) != exp2) {
                flip2++;
            }

            if (j - i + 1 > n) {

                char exp1Remove = (i % 2 == 1) ? '0' : '1';
                char exp2Remove = (i % 2 == 1) ? '1' : '0';

                if (s.charAt(i % n) != exp1Remove) {
                    flip1--;
                }

                if (s.charAt(i % n) != exp2Remove) {
                    flip2--;
                }

                i++;
            }

            if (j - i + 1 == n) {
                res = Math.min(res, Math.min(flip1, flip2));
            }

            j++;
        }

        return res;
    }
}
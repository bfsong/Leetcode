/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */
class Solution {
    public int reverse(int x) {
        int result = 0;
        int max_limit = Integer.MAX_VALUE / 10;
        int min_limit = Integer.MIN_VALUE / 10;
        while( x != 0) {
            int m = x % 10;
            if (result > max_limit || (max_limit == result && m > 7)) {
                return 0;
            }

            if (result < min_limit || (min_limit == result && m < -8)) {
                return 0;
            }

            result  = result * 10 + m;
            x /= 10;
        }
        return result;
    }


}


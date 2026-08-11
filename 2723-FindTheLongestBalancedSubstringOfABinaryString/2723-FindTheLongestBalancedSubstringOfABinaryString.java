// Last updated: 11/08/2026, 14:16:23
public class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int maxLen = 0;
        int i = 0;
        int n = s.length();

        while (i < n) {
            int zeros = 0;
            int ones = 0;

            while (i < n && s.charAt(i) == '0') {
                zeros++;
                i++;
            }
            while (i < n && s.charAt(i) == '1') {
                ones++;
                i++;
            }

            maxLen = Math.max(maxLen, 2 * Math.min(zeros, ones));
        }

        return maxLen;
    }
}
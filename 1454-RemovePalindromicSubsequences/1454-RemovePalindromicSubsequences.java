// Last updated: 11/08/2026, 14:19:43
public class Solution {
    public int removePalindromeSub(String s) {
        if (s.isEmpty()) return 0;
        if (isPalindrome(s)) return 1;
        return 2;
    }

    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
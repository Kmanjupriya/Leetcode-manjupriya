// Last updated: 11/08/2026, 14:17:16
public class Solution {
    public int minimumMoves(String s) {
        int moves = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'X') {
                moves++;
                i += 3; // Cover i, i+1, and i+2
            } else {
                i++;
            }
        }
        return moves;
    }
}
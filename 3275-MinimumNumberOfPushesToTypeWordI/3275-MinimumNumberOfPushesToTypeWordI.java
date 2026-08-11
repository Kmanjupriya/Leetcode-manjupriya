// Last updated: 11/08/2026, 14:14:54
public class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int totalPushes = 0;

        for (int i = 0; i < n; i++) {
            totalPushes += (i / 8) + 1;
        }

        return totalPushes;
    }
}
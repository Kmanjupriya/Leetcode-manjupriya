// Last updated: 11/08/2026, 14:18:09
public class Solution {
    public boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        int mid = s.length() / 2;
        int vowelCount = 0;
        
        for (int i = 0; i < mid; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) vowelCount++;
            if (vowels.indexOf(s.charAt(mid + i)) != -1) vowelCount--;
        }
        
        return vowelCount == 0;
    }
}
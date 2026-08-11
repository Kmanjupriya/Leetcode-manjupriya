// Last updated: 11/08/2026, 14:18:38
public class Solution {
    public String restoreString(String s, int[] indices) {
        char[] shuffled = new char[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            shuffled[indices[i]] = s.charAt(i);
        }
        
        return new String(shuffled);
    }
}
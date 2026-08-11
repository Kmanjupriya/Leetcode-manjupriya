// Last updated: 11/08/2026, 14:17:33
class Solution {
    public boolean makeEqual(String[] words) {
        int[] counts = new int[26];
        int numWords = words.length;
        
        for (String word : words) {
            for (char c : word.toCharArray()) {
                counts[c - 'a']++;
            }
        }
        
        
        for (int count : counts) {
            if (count % numWords != 0) {
                return false;
            }
        }
        
        return true;
    }
}
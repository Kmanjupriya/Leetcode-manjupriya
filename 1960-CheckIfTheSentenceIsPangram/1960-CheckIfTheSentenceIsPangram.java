// Last updated: 11/08/2026, 14:17:44
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        int uniqueCount = 0;
        
        for (int i = 0; i < sentence.length(); i++) {
            int idx = sentence.charAt(i) - 'a';
            if (!seen[idx]) {
                seen[idx] = true;
                uniqueCount++;
                if (uniqueCount == 26) {
                    return true; // Found all 26 letters early
                }
            }
        }
        return false;
    }
}
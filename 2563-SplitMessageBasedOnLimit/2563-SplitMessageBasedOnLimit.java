// Last updated: 11/08/2026, 14:16:47
public class Solution {
    public String[] splitMessage(String message, int limit) {
        int n = message.length();
        int sa = 0; // Cumulative length of part numbers 1..k
        
        for (int k = 1; k <= n; k++) {
            int digitLenK = String.valueOf(k).length();
            sa += digitLenK;
            
            // Total space consumed by suffixes across k parts:
            // sa: sum of lengths of 'a'
            // digitLenK * k: length of 'b' repeated k times
            // 3 * k: total length of symbols '<', '/', '>'
            int totalSuffixLen = sa + (digitLenK * k) + (3 * k);
            int availableCapacity = (limit * k) - totalSuffixLen;
            
            if (availableCapacity >= n) {
                String[] result = new String[k];
                int idx = 0;
                
                for (int j = 1; j <= k; j++) {
                    String tail = "<" + j + "/" + k + ">";
                    int maxChunkLen = limit - tail.length();
                    int end = Math.min(n, idx + maxChunkLen);
                    
                    result[j - 1] = message.substring(idx, end) + tail;
                    idx = end;
                }
                return result;
            }
        }
        
        return new String[0];
    }
}
// Last updated: 11/08/2026, 14:15:15
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        int maxFreq = 0;
        
        // First pass: Track frequencies and find the maximum frequency
        for (int num : nums) {
            int freq = counts.getOrDefault(num, 0) + 1;
            counts.put(num, freq);
            maxFreq = Math.max(maxFreq, freq);
        }
        
        // Second pass: Sum up the frequencies that match the max frequency
        int totalMaxFreqElements = 0;
        for (int freq : counts.values()) {
            if (freq == maxFreq) {
                totalMaxFreqElements += maxFreq;
            }
        }
        
        return totalMaxFreqElements;
    }
}